package sudhir.amazon.ds.array;

import java.util.Arrays;
import java.util.List;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,0,9};
        System.out.println(getTotalWaterTrapped(arr, arr.length));
    }

    private static long getTotalWaterTrapped(int[] arr, int n) {
        long totalWaterTrapped = 0L;
        // lmax to check max left from current index
        int[] lmax = new int[n];
        lmax[0] = arr[0];
        // rmax to check max left from current index
        int[] rmax = new int[n];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            totalWaterTrapped += Math.min(lmax[i], rmax[i])-arr[i];
        }
        return totalWaterTrapped;
    }
}
