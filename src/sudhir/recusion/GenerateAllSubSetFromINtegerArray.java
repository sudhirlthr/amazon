package sudhir.recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
* */
public class GenerateAllSubSetFromINtegerArray {
    static List<List<Integer>> subsets = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        getAllSubsetFromArray(arr, 0, numbers, subsets);
        System.out.println(subsets.toString());
    }

    private static void getAllSubsetFromArray(int[] arr, int i, List<Integer> numbers, List<List<Integer>> subsets) {
        if (i== arr.length) {
            subsets.add(numbers);
            return;
        }
        getAllSubsetFromArray(arr, i+1, new ArrayList<Integer>(numbers),subsets);
        numbers.add(arr[i]);
        getAllSubsetFromArray(arr, i+1,new ArrayList<Integer>(numbers), subsets);
    }
}
