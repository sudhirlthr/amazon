package sudhir.recusion;
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
*
* */
public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 30;
        System.out.println(getNumberOfPossibleSunSetEqualToSum(arr, sum));
    }

    private static int getNumberOfPossibleSunSetEqualToSum(int[] arr, int sum) {

        return 0;
    }
}
