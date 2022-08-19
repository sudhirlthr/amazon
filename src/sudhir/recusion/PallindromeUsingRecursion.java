package sudhir.recusion;

public class PallindromeUsingRecursion{
    public static void main(String[] args){
        String str = "goog";
        System.out.println(chechPallindrome(str, 0, str.length()-1));
    }
    static boolean chechPallindrome(String str, int start, int end){
        if(start >= end) return true;
        return (str.charAt(start) == str.charAt(end)) && chechPallindrome(str, start+1, end-1);
    }
}
