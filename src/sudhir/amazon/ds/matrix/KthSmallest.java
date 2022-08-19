package sudhir.amazon.ds.matrix;

import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int k = 8;
        System.out.println("findKthSmallestinMatrix output: "+findKthSmallestinMatrix(matrix, k));
        System.out.println("findKthSmallestinMatrixWithOrderOfn output: "+findKthSmallestinMatrixWithOrderOfn(matrix, k));
        System.out.println("findKthSmallestinMatrixUsingPriorityQueue output: "+findKthSmallestinMatrixUsingPriorityQueue(matrix, k));
    }
    private static Integer findKthSmallestinMatrixUsingPriorityQueue(int[][] matrix, int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int[] row:matrix) {
            for (int elements : row) {
                minHeap.add(elements);
            }
        }
        for (int i = 0; i < k-1; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    private static Integer findKthSmallestinMatrixWithOrderOfn(int[][] matrix, int k) {
        int start = matrix[0][0];
        int end = matrix[matrix.length-1][matrix[0].length-1];
        int row = matrix.length;
        int col = matrix[0].length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            int j = matrix[0].length-1;
            int count = 0;
            for (int i = 0; i < row; i++) {
                while (j>=0 && matrix[i][j]>mid)j--;
                count += j+1;
            }
            if(count<k ) start = mid+1;
            else
                end = mid;
        }
        return end;
    }

    private static Integer findKthSmallestinMatrix(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
