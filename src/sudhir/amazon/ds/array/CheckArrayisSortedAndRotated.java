package sudhir.amazon.ds.array;

import java.util.ArrayList;

public class CheckArrayisSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,14};
        System.out.println(checkRotatedAndSorted(arr, arr.length));
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){

        // Your code here
        int index = isArraySorted(arr, num);
        return index != -1;
    }
    private static int isArraySorted(int[] arr, int n){
        int index = -1, i=0;
        while(true){
            if(i < n-1 && arr[i] <= arr[i+1]){
                index = i;
                i++;
            }else break;
        }
        if(index == -1 || index+2 == n) return -1;
        if (index +2 < n){
            if (index+2 == n-1 && arr[index+1] > arr[index+2]) index = -1;
            else{
                for(i=index+2;i<n-1;i++){
                    if(arr[i] > arr[i+1]) {
                        index = -1;
                        break;
                    }
                }
            }
        }

        return index;
    }
}
