package sudhir.amazon.ds.numbers;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        System.out.println(isConsecutive("121315"));
    }
    public static boolean isConsecutive(String str){
        if (str == null || str.isEmpty()) return false;
        Integer number;
        for (int i = 0; i < str.length()/2; i++) {
            String subString = str.substring(0, i+1);
            number = Integer.parseInt(subString);
            while (subString.length() < str.length()){
                number++;
                subString = subString.concat(String.valueOf(number));
            }
            if (subString.equals(str)) return true;
        }
        return false;

    }
}
