package sudhir.amazon.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Given an array of integers of size 'n'.
Our aim is to calculate the maximum sum of 'k'
consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23}
of size 4.

Input  : arr[] = {2, 3}
         k = 3
Output : Invalid
*
*
* */
public class WindowSlidingTechnique_SumOfKthBlockInAnrray {
    public static void main(String[] args) {
        int k = 4;
        System.out.println(getMaximumSumOfKthElements(new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20},k));
    }

    private static Integer getMaximumSumOfKthElements(int[] array, int k) {
        int max_sum=0, current_sum=0,window_sum=0;
//        Integer[] arr = list.toArray(new Integer[list.size()]);
//        Integer[] arr2 = list.stream().toArray(Integer[]::new);
        window_sum = Arrays.stream(Arrays.copyOfRange(array, 0, k)).sum();
        max_sum = window_sum;
        for (int i = 1; i <= array.length-k; i++) {
            window_sum = window_sum - array[i-1] + array[k-1+i];
            current_sum = window_sum;
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
