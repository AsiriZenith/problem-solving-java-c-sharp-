import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String lastStr = s.substring(8);
        
        String timeOfParameterValue = s.substring(0,8);
        
        String hourValueStr = timeOfParameterValue.substring(0,2);
        
        int hourValue = Integer.parseInt(hourValueStr);
        
        String exceptHourValue = timeOfParameterValue.substring(2);
        
        String actualTimeValue="";
        
        if(lastStr.equals("AM")){
            actualTimeValue = timeOfParameterValue;
        }
        else if(lastStr.equals("PM")){
            hourValue += 12;
            hourValueStr = String.valueOf(hourValue);
            actualTimeValue = hourValueStr + exceptHourValue;
        }
        
        return actualTimeValue;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
