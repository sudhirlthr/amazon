package sudhir.amazon.ds.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


/*
* Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
*
* */

public class FirstSmallestPositiveMissingInteger {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0};
        System.out.println(getFirstSmallestPositive(arr));
    }

    private static int getFirstSmallestPositive(int[] arr) {
        // using hashTable with TC: O(n). SC: O(n)
        System.out.println(getFirstSmallestPositive_UsingHashTable(arr));

        // 2nd Approach: keep all negative one side and +ve another side
        // and then start with positive integers
        // For each element ele, to mark that it is present in the array,
        // we change the value at index ele to its negative.
        // Then, we again iterate on the array and return the first index with a positive value.
        return getFirstSmallestPositive_UsingDivideApproach(arr);
    }

    private static int getFirstSmallestPositive_UsingDivideApproach(int[] arr) {
        // first move -Ve one side and +Ve another side using swapping
        int n = arr.length;;
        int moved = distribute(arr, n);
        int[] aCopy = new int[n - moved];
        int j = 0;
        for (int i = moved; i < n; i++) {
            aCopy[j] = arr[i];
            j++;
        }
        return getMEXUtil(aCopy, n - moved);
    }
    public static int distribute(int[] a, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return j;
    }
    public static int getMEXUtil(int[] a, int till) {
        for (int i = 0; i < till; i++) {
            if (Math.abs(a[i]) - 1 < till && a[Math.abs(a[i]) - 1] > 0) {
                a[Math.abs(a[i]) - 1] *= (-1);
            }
        }
        for (int i = 0; i < till; i++) {
            if (a[i] > 0) {
                return i + 1;
            }
        }
        return till + 1;
    }

    private static int getFirstSmallestPositive_UsingHashTable(int[] arr) {
        // Collections.addAll(set, arr);
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) return i;
        }
        return -1;
    }
}
