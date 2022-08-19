package sudhir.amazon.ds.array;

import static java.lang.Math.max;
import static java.lang.Math.min;

/*
* Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.


Example 1:

Input:
N = 2
A[] = {1, 10}
Output:
1
Explanation:
A[0]<A[1] so (j-i) is 1-0 = 1.
Example 2:

Input:
N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array A[1] < A[7]
satisfying the required
condition(A[i] < A[j]) thus giving
the maximum difference of j - i
which is 6(7-1).
*
* */
public class MaximumIndexDifference {
    public static void main(String[] args) {
        int[] array = new int[]{35,98,95,94,75, 8, 47, 28, 75, 91, 28, 83, 72, 54, 67, 9, 34};
        System.out.println(getMaximumDifference(array));
    }

    private static int getMaximumDifference(int[] A) {
        {
            int N = A.length;
            int first = 0;
            int second = 0;
            int maxdiff = -1;
            int[] left = new int[N];
            int[] right = new int[N];
            //  left[] min array : )
            left [0] = A[0];
            for(int i =1;i<N;i++){
                left[i]= Math.min(A[i],left[i-1]);
            }
            //  rigt[] max : )
            right[N-1] = A[N-1];
            for(int j =N-2;j>=0;j--){
                right[j] = Math.max(A[j],right[j+1]);
            }
            // sums up the creation of two arrays now
            while(first < N && second < N){
                if(left[first]<=right[second]){
                    maxdiff = Math.max(maxdiff,second - first );
                    second ++ ;
                }
                else{first++;}
            }
            return maxdiff;
        }
    }
}
