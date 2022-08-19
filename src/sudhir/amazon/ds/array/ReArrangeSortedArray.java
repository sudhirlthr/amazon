package sudhir.amazon.ds.array;

import java.util.Arrays;

/*
*
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself.

Example 1:

Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.
*
* */
public class ReArrangeSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reArrangeArrayAlternatively(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[]{5,0,3,7,1,4,6,2};
        reArrangeArrayAlternatively_withoutExtraSpace(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }

    private static void reArrangeArrayAlternatively_withoutExtraSpace(int[] arr2, int n) {
        int max_i = n-1, min_i = 0, largerElement = arr2[n-1]+1;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                arr2[i] += largerElement * (arr2[max_i%largerElement]);
                max_i--;
            }else {
                arr2[i] += largerElement * (arr2[min_i]%largerElement);
                min_i++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr2[i] /= largerElement;
        }

    }

    private static void reArrangeArrayAlternatively(int[] arr, int n) {
        int i = 0, j = arr.length-1, index = 0;
        int[] arrayCopy = new int[arr.length];

        while (i<j){
            arrayCopy[index] = arr[j];
            arrayCopy[index+1] = arr[i];
            index += 2;
            i++;
            j--;
        }
        // for odd length
        if(i==j) arrayCopy[arrayCopy.length-1] = arr[j];
        System.arraycopy(arrayCopy, 0, arr, 0, n);
        //return arr;
    }
}
