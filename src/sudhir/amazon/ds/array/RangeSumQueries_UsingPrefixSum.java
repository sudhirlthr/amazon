package sudhir.amazon.ds.array;

import java.util.Scanner;

/*
* Description : We are given an Array of n integers, We are given q queries having indices l and r .
We have to find out sum between the given range of indices.
Input
[4, 5, 3, 2, 5]
3
0 3
2 4
1 3
Output
14 (4+5+3+2)
10 (3+2+5)
10 (5+3+2)
*
*
* Solution : The numbers of queries are large.
* It will be very inefficient to iterate over the array and calculate the sum for each query separately.
* We have to devise the solution so that we can get the answer of the query in constant time.
* We will be storing the sum upto a particular index in prefix sum Array.
* We will be using the prefix sum array to calculate the sum for the given range.
* */
public class RangeSumQueries_UsingPrefixSum {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 3, 2, 5};
        int query = 3;
        printRangeSumQuery(array, query);
    }

    private static void printRangeSumQuery(int[] array, int query) {
        int[][] queryRange = new int[array.length][2];
        int[] prefixSum = new int[array.length];
        int j = 0;
        for (int i = 0; i < query; i++) {
            System.out.println("Please enter range number: "+(i+1));
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputArray = input.split("\\s+");
            queryRange[i][j++] = Integer.parseInt(inputArray[0]);
            queryRange[i][j] = Integer.parseInt(inputArray[1]);
            j=0;
        }
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        for (int i = 0; i < query; i++) {
            int l = queryRange[i][0];
            int r = queryRange[i][1];
            if (l==0)
                System.out.println(prefixSum[r]);
            else
                System.out.println(prefixSum[r] - prefixSum[l-1]);
        }
    }
}
