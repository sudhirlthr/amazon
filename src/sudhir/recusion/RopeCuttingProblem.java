package sudhir.recusion;

public class RopeCuttingProblem {
    /*
    Given a rope with length N,
    you have to cut this rope with either of length a,b,c or with combinations so that number of pieces are maximum
    *
Input : n = 5, a = 2, b = 5, c = 1
Output : 5
(We make 5 pieces of length 1 each)

Example 2:

Input : n = 23, a = 12, b = 9, c = 11
Output : 2
(We make 2 pieces of length 11 and 12)

Example 3:

Input : n = 5, a = 4, b = 2, c = 6
Output : -1
(Not Possible)

Example 4:
Input : n = 9, a = 2, b = 2, c = 2
Output : -1
(Not Possible)
    *
    * */
    public static void main(String[] args) {
        int n = 9, a = 2, b = 2, c = 2;
        System.out.println(getMaximumValidPieces(n, a, b, c));
    }

    private static int getMaximumValidPieces(int n, int a, int b, int c) {
        if (n==0) return 0;
        if (n < 0) return -1;
        int result = Math.max(getMaximumValidPieces(n-a, a, b, c),Math.max(getMaximumValidPieces(n-b, a, b, c), getMaximumValidPieces(n-c, a, b, c)));

        if (result == -1) return -1;
        if (result >= 0) return result+1;
        return -1;
    }
}
