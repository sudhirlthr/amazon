package sudhir.recusion;

public class GenerateSubSetFromString {
    public static void main(String[] args) {
        String str = "ABC";
        generateSubString(str, "", 0);
    }

    private static void generateSubString(String str, String current, int i) {
        if (i == str.length()) {
            System.out.print("{ "+current+" }, ");
            return;
        }
        generateSubString(str, current, i+1);
        generateSubString(str, current+str.charAt(i), i+1);
    }
}
