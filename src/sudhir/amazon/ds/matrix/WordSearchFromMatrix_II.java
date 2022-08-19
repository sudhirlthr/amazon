package sudhir.amazon.ds.matrix;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchFromMatrix_II {
    private boolean[][] visited;
    public static void main(String[] args) {
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] word = new String[]{"oath","pea","eat","rain"};
        System.out.println("Is word possible: "+new WordSearchFromMatrix_II().exists(board,word));
    }

    public List<String> exists(char[][] board, String[] words) {
         visited = new boolean[board.length][board[0].length];
        Set<String> wordList = new HashSet<>();
        for(String word: words){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if (word.charAt(0) == board[i][j])
                        if(search(board, word, 0, i, j)) wordList.add(word);
                }
            }
        }
        return wordList.stream().toList();
    }
    public boolean search(char[][] board, String word, int current, int row, int col){
        if(current == word.length()) return true;
        if(row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1 ||
                visited[row][col] == true || board[row][col] != word.charAt(current))
            return false;
        visited[row][col] = true;
        if (board[row][col] == word.charAt(current) && ( col == row-1)) return true;
        boolean a = search(board, word,current+1, row+1, col );
        boolean b = search(board, word,current+1, row-1, col );
        boolean c = search(board, word,current+1, row, col+1 );
        boolean d = search(board, word,current+1, row, col-1 );
        if(a || b || c || d )
            return true;
        visited[row][col] = false;
        return false;
    }
}
