package sudhir.recusion;

import java.util.Arrays;

/*
* There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.
*
* Example:
* Input: n = 5, k = 2
* Output: 3
* */
public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7, k=3;
        // if index is starting from 0;
        System.out.println(findTheWinner(n, k));
        // if index starting from 1;
        System.out.println(findWinnerFromIndex1(5, 2));
    }

    private static int findWinnerFromIndex1(int n, int k) {
        return findTheWinner(n, k)+1;
    }

    public static int findTheWinner(int n, int k) {
        if(n==1) return 0;
        return (findTheWinner(n-1, k)+k)%n;
    }
}
