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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int value5 = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == 1){
               value1++;
           } else if(arr.get(i) == 2) {
               value2++;
           } else if(arr.get(i) == 3) {
               value3++;
           } else if(arr.get(i) == 4) {
               value4++;
           } else if(arr.get(i) == 5) {
               value5++;
           }
        }
        
        list.add(value1);
        list.add(value2);
        list.add(value3);
        list.add(value4);
        list.add(value5); 
        
        int maxValue = 0;
        
        for(int i=0; i<5; i++){
            if(maxValue < list.get(i)){
                maxValue = list.get(i);
            }
        }
        
        for(int i=0; i<5; i++){
            if(maxValue == list.get(i)){
                return i+1;
            }
        }
        return 0;
    }

}

public class SolutionBirdQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
