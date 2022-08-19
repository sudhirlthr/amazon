package sudhir.amazon.ds.array;


import java.util.Arrays;

/*
* Input  : arr[] = {10, 20, 10, 5, 15}
Output : prefixSum[] = {10, 30, 40, 45, 60}
* */
public class PrefixSum {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 10, 5, 15};
        int[] result = new int[array.length];
        getPrefixSum(array, result);
        System.out.println(Arrays.toString(result));
    }

    private static void getPrefixSum(int[] array, int[] prefixSum) {
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
    }
}
