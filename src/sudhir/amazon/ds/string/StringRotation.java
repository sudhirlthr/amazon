package sudhir.amazon.ds.string;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isS1SubStringOfS2(s1, s2));
        System.out.println(checkSubString(s1, s2));;
    }

    private static boolean isS1SubStringOfS2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String concat = s1+s1;
        return concat.indexOf(s2) != -1;
    }
    private static boolean checkSubString(String s1, String s2){
        int counter = 0, i=0;
        s2= s2+s2;
        for (;i<s2.length();i++){
            if (counter == s1.length()) return true;
            if (s1.charAt(counter) == s2.charAt(i)) counter++;
            else {
                if (counter > 0) i-= counter;
                counter = 0;
            }
        }
        return counter == s2.length();
    }
}
