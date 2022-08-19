package sudhir.recusion;

public class SUmOfDigitUsingRecusion {
    public static void main(String[] args) {
        System.out.println(getSum(0));
    }

    private static int getSum(int number) {
        if(number < 9) return number;
        return number % 10 + getSum(number/10);
    }
}
