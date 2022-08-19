package sudhir.amazon.ds.matrix;

import java.util.HashMap;
import java.util.Map;

public class WordSearchFromMatrix {
    private boolean[][] visited;
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        String word ="ABCCE";
        System.out.println("Is word possible: "+new WordSearchFromMatrix().exists(board,word));
    }

    public boolean exists(char[][] board, String word) {
         visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)){
                    if(search(board, word, 0, i, j)) return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board, String word, int current, int row, int col){
        if(current == word.length()) return true;
        if(row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1 || visited[row][col] == true || board[row][col] != word.charAt(current))
            return false;
        visited[row][col] = true;
        boolean a = search(board, word,current+1, row+1, col );
        boolean b = search(board, word,current+1, row-1, col );
        boolean c = search(board, word,current+1, row, col+1 );
        boolean d = search(board, word,current+1, row, col-1 );
        if(a || b || c || d)
            return true;
        visited[row][col] = false;
        return false;
    }
}
