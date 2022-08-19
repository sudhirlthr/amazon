package sudhir.amazon.ds.array;

import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class KthMex {
    public static void main(String[] args) throws IOException {
        final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:56.0) Gecko/20100101 FireFox/56.0)" ;
        URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name=India");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("User-Agent", USER_AGENT);
        urlConnection.connect();
        Object content = urlConnection.getContent();

        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null){
            sb.append(line);
        }
        
        int[] arr = new int[]{14 ,13 ,17 ,7 ,13 ,5 ,16 ,18 ,10,17,8,0,0,17,1,3,7,16,11,14};
        System.out.println(kthMex(arr.length, 9, arr));
    }
    static int kthMex(int n, int k, int arr[]) {
        // add your code here
        Arrays.sort(arr);
        int start = 0, index = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<=arr[n-1];i++){
            if(!list.contains(i)){
                list2.add(i);
            }
        }
        return list2.get(k-1);
    }
}
