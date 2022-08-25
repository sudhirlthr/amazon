package sudhir.recusion;

import java.net.Socket;

/*
* Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.


Example 1:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
Output: 1
Explanation: Here there exists a subset with
sum = 9, 4+3+2 = 9.
Example 2:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 30
Output: 0
Explanation: There is no subset with sum 30.
* */
public class SubSetSumProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 90;
        System.out.println(getNumberOfSumPossibleFromSubset(arr, sum, arr.length));
    }

    // TC: Θ(2^n), because for n length there would be 2^n leaves int the tree and then 2^n-1 internal nodes
    private static int getNumberOfSumPossibleFromSubset(int[] arr, int sum, int n) {
        if (n==0){
            return (sum==0)?1:0;
        }
        return getNumberOfSumPossibleFromSubset(arr, sum, n-1) + getNumberOfSumPossibleFromSubset(arr, sum-arr[n-1], n-1);
    }
}
