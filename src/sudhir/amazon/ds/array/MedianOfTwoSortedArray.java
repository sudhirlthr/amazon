package sudhir.amazon.ds.array;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(getTheMedian(new int[] {1,2}, new int[]{3,4}));
    }

    private static double getTheMedian(int[] array1, int[] array2) {
        // merge the array, and the get the median
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j=0, k=0;
        while(i < array1.length && j < array2.length){
            if (array1[i] <= array2[j])
                mergedArray[k++] = array1[i++];
            else
                mergedArray[k++] = array2[j++];
        }
        while (i < array1.length)
            mergedArray[k++] = array1[i++];
        while (j < array2.length)
            mergedArray[k++] = array2[j++];
        if (mergedArray.length %2 == 0){
            return  (double) (mergedArray[(mergedArray.length / 2)-1] + mergedArray[mergedArray.length / 2])/2;
        }else
            return  mergedArray[mergedArray.length / 2];
    }
}
