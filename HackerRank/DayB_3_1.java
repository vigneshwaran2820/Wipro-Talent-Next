import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

  
    public static long getTime(String s) {
   
    char ch='A';
    long x=0;
    for(int i=0;i<s.length();i++){
        int y=Math.abs(ch-s.charAt(i));
        if(y<13){
            x+=y;
            ch=s.charAt(i);
        }
        else{
            x+=26-y;
            ch=s.charAt(i);
        }
    }
    return x;

    }

}
public class Solution {
 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long result = Result.getTime(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
