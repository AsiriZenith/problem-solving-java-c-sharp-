import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String v = s.substring(8,10);
        
        if(v.equals("AM")) {
            s = s.substring(0,8);
            String v1 = s.substring(0,2);
            Integer first_two = Integer.parseInt(v1);
            if(first_two == 12) {
                String v2 = s.substring(2,8);
                s = "00" + v2;
            }
        }
        else if(v.equals("PM")) {
            String v1 = s.substring(0,2);
            Integer first_two = Integer.parseInt(v1);
            
            if (first_two == 12) {
                s = s.substring(0,8);
            } else {
                String v2 = s.substring(2,8);
                first_two = first_two + 12;
                v1 = Integer.toString(first_two);
                s = v1 + v2;
            }
        } 
        return s;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
