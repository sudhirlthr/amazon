package sudhir.ola;

/*
* Count all possible paths from top left to bottom right of a mXn matrix

Difficulty Level : Easy
Last Updated : 03 Aug, 2022
The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down
Examples :

Input :  m = 2, n = 2;
Output : 2
There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input :  m = 2, n = 3;
Output : 3
There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)
*
*
* */
public class CountAllPossibleInMatrix {
    public static void main(String[] args) {
        System.out.println(getAllPossibleWays(2,3));
        System.out.println(getAllPossibleWaysInMNTC(2,3));
    }

    // TC: 2^n
    private static int getAllPossibleWays(int m, int n) {
        if(m ==1 || n==1) return 1;
        return getAllPossibleWays(m-1, n) + getAllPossibleWays(m, n-1);
    }

    private static int getAllPossibleWaysInMNTC(int m, int n) {
        if(m ==1 || n==1) return 1;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            matrix[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        return matrix[m-1][n-1];
    }

}
