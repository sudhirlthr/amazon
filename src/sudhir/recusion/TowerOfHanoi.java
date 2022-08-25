package sudhir.recusion;

public class TowerOfHanoi {
    private static int NumberOfMove = 0;
    public static void main(String[] args) {

        getNumberOfMove(3, 'A', 'B', 'C');
        System.out.println("NumberOfMove: "+NumberOfMove);
        TOH toh = new TOH();
        toh.getNumberOfMove(3, 1, 2, 3);
        System.out.println("TOH: number of moved = "+TOH.numberOfMove );
    }

    private static void getNumberOfMove(int n, char a, char b, char c) {
        if(n==0) return;
        if (n==1){
            NumberOfMove++;
            System.out.println("Number of move : 1 from "+a+" to "+c+".");
            return;
        }
        getNumberOfMove(n-1, a, c, b);
        {
            System.out.println("Number of move : " + n + " from "+a+" to "+c+".");
            NumberOfMove ++;
        }
        getNumberOfMove(n-1, b, a, c);
    }
}
class TOH{
    public static long numberOfMove = 0;
    public void getNumberOfMove(int n, int from , int to , int aux){
        if (n==1){
           numberOfMove ++;
           return;
        }
        getNumberOfMove(n-1, from, aux, to);
        numberOfMove ++;
        getNumberOfMove(n-1, aux, to, from);
    }
}
