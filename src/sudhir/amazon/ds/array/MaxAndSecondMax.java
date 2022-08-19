package sudhir.amazon.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(getMAxAndSecondMax(arr));
    }

    public static List<Integer> getMAxAndSecondMax(int[] arr) {
        Integer max = Arrays.stream(arr).max().getAsInt();
        Integer secondMax = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < max && secondMax < arr[i]){
                secondMax = arr[i];
                flag = true;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max);
        if (flag) list.add(secondMax);
        else list.add(-1);
        return list;

    }
}
