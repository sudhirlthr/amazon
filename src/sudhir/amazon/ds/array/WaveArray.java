package sudhir.amazon.ds.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WaveArray {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,2,2,1};
        frequencyCount(array, 5, 3);
        System.out.println(Arrays.toString(array));
    }
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(arr[i] <= N && arr[i] <=P){
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])+1);
                }else map.put(arr[i], 1);
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i] <= N && arr[i] <= P){
                arr[i] = map.getOrDefault(i + 1, 0);
            }else arr[i] = 0;
        }

    }
}
