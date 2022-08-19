package sudhir.amazon.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,0};

        System.out.println(Arrays.toString(new ArrayList[]{leaders(arr, arr.length)}));
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(max < arr[i] ){
                max = arr[i];
                list.add(max);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
