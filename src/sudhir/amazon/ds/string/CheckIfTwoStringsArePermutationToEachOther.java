package sudhir.amazon.ds.string;

import java.util.Arrays;

public class CheckIfTwoStringsArePermutationToEachOther {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(isTwoStringsArePermutation(s1, s2));
        System.out.println(is_s2CntainsAPermutationOfS1(s1, s2));
        System.out.println(usingSorting(s1, s2));
    }

    private static boolean usingSorting(String s1, String s2) {
        s1 = sort(s1);
        s2 = sort(s2);
        return s2.indexOf(s1)!=-1;
    }

    private static boolean isTwoStringsArePermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] stringLength = new int[128];
        for (int i = 0; i < s2.length(); i++) {
            stringLength[s2.charAt(i)]++;
        }
        for (int i = 0; i < s1.length(); i++) {
            stringLength[s1.charAt(i)]--;
            if (stringLength[s1.charAt(i)]<0) return false;
        }
        return true;
    }

    private static boolean is_s2CntainsAPermutationOfS1(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s2 = s2.replace(c, '#');
        }
        int i = 0, j=0;
        for (; i < s2.length()-1; i++) {
            if('#' == s2.charAt(i)) break;;
        }
        for (int k = 0; k < s2.length(); k++) {
            if (s2.charAt(k) == '#') count++;
        }
        if (count > s1.length()) return false;
        for (int k = 0; k < s1.length(); k++) {
            if(s2.charAt(i) == '#') i++;
            else return false;
        }
        return true;
    }
    private static String sort(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
