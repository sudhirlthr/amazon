package sudhir.amazon.ds.array;

import java.util.Arrays;

/*
*
Description : We are given an array of positive and negative integers. We have to find the subarray having maximum sum.
Input
[-3, 4, -1, -2, 1, 5]
Output
7
(4+(-1)+(-2)+1+5)
*
*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
* */
public class LargestContiguousSubArraySum {
    public static void main(String[] args) {
        int[] array  = new int[]{1,2,3,-2, 5};
        System.out.println(getLargestContiguousSubArraySum(array));
    }

    private static Integer getLargestContiguousSubArraySum(int[] array) {
        Integer max = Integer.MIN_VALUE;
        Integer currentMax = 0;
        for (int i = 0; i < array.length; i++) {
            currentMax += array[i];
            if (max < currentMax) max = currentMax;

            if (currentMax < 0) currentMax = 0;
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(10+" ");
        stringBuffer.append(20);
        System.out.println(stringBuffer);
        return max;
    }
}
