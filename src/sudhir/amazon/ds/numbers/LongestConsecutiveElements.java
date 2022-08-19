package sudhir.amazon.ds.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestConsecutiveElements {
    public static void main(String[] args) {
        System.out.println("Longest Consecutive length: "+LongestConsecutiveLength(new int[]{100,4,200,3,1,2}));
    }
    public static Integer LongestConsecutiveLength(int[] nums){
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]+1)){
                if (i == nums.length-1 || i==0)
                    numberList.add(nums[i]+1);
                numberList.add(nums[i]);

            }
        }
        return numberList.size();
    }
}
