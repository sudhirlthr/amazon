package sudhir.leetcode;


import java.util.*;

public class Triplet {
    public static void main(String[] args) {
        //new Triplet().threeSum(new int[]{-1,0,1,2,-1,-4}).forEach(number -> System.out.println(number));
        new Triplet().findTriplets(new int[]{-2,0,1,1,2}).forEach(number -> System.out.println(number));

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> uniqueTriplets = new ArrayList<>();
        getTripletList(nums).forEach(list-> {
            if (( list !=null && !list.isEmpty()) && list.stream().mapToInt(Integer::intValue).sum() == 0)
                uniqueTriplets.add(list);
        });
        return uniqueTriplets;
    }
    public List<List<Integer>> getTripletList(int[] nums){
        Set<List<Integer>> triplets = new HashSet<>();
        if (nums.length <= 2) return triplets.stream().toList();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }
        if (arrayList.stream().mapToInt(Integer::intValue).sum()==0){
            List<Integer> integers = null;
            for (int i = 0; i <= arrayList.size() - 3; i++) {
                if (arrayList.get(i) + arrayList.get(i+1) + arrayList.get(i+2) ==0){
                    integers = new ArrayList<>();
                    integers.add(arrayList.get(i));
                    integers.add(arrayList.get(i+1));
                    integers.add(arrayList.get(i+2));
                }
            }
            triplets.add(integers);
            return triplets.stream().toList();
        }
        int j=0,k=0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            j=nums.length-1;
            k=j-1;
            while(i<j){
                if(i != j && j != k && i != k && nums[i]+nums[j]+nums[k]==0){
                    flag = true;
                    break;
                }
                k--;
                if (k<i){
                    k=j-1;
                    j--;
                }
            }
            if (flag){
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(nums[i]);
                integers.add(nums[j]);
                integers.add(nums[k]);
                triplets.add(integers);
            }
        }
        return triplets.stream().toList();
    }
    private List<List<Integer>> findTriplets(int[] array){
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> elements = null;
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            int l = i+1;
            int r = array.length-1;
            int x = array[i];
            boolean flag = false;
            while (l<r){
                if(i !=l && l!=r && r != i && x + array[l] + array[r] == 0){
                    elements = new ArrayList<Integer>();
                    elements.add(x);
                    elements.add(array[l]);
                    elements.add(array[r]);
                    l++;
                    r--;
                    flag = true;
                    result.add(elements);
                    elements = null;
                }else if(x + array[l] + array[r] < 0){
                    l++;
                }else
                    r--;
            }
        }
        return result.stream().toList();
    }
}
