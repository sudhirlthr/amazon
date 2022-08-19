package sudhir.amazon.ds.array;

import java.util.Arrays;

/*
* Description - Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. We are given an Array of integers, We have to find out the first index i from left such that -
A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]
Input
[-7, 1, 5, 2, -4, 3, 0]
Output
3
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
*
* */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] array = new int[]{};
        System.out.println("Equilibrium Index: "+getEquilibriumIndex(array));
    }

    private static Integer getEquilibriumIndex(int[] array) {
        long[] a = new long[10];
        int sum = 0, leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
            if (leftSum == sum)
                return i;
            leftSum += array[i];
        }
        return -1;
    }
}
