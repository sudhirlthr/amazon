package sudhir.amazon.ds.string;

public class StringProblems {
    public static void main(String[] args) {
        System.out.println(reverseWords("i like this program very much"));
    }
    static String reverseWords(String S)
    {
        // code here
        if(S.length()==0) return S;
        //String[] arr = S.split("\\.");
        String[] arr = S.split(" ");
        String res = "";
        for(int i=arr.length-1;i>=0;i--){
            if(i==0)
                res = res+arr[i];
            else
                res = res+arr[i]+".";
        }
        return res;
    }
}
