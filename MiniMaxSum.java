import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long miniSum = 0;
        long maxSum = 0;
        long sumOfWholeElementOfArray = 0;
        long minimumNumber, maximumNumber;
        
        for(int i=0;i<arr.length;i++){
            sumOfWholeElementOfArray += arr[i];
        }
        
        minimumNumber = arr[0];
        maximumNumber = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(minimumNumber > arr[i]){
                minimumNumber = arr[i];
            }
            if(maximumNumber < arr[i]){
                maximumNumber = arr[i];
            }
        }
        
        miniSum = sumOfWholeElementOfArray - maximumNumber;
        maxSum = sumOfWholeElementOfArray - minimumNumber;
        
        System.out.println(miniSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}