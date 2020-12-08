import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plusMinus{

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int sumOfplusElements = 0;
        int sumOfminusElements = 0;
        int sumOfzeroElements = 0;
        int arraylength = arr.length;
        
        for(int i=0 ; i<arraylength ;i++ ){
            if(arr[i] > 0){
                sumOfplusElements++;
            }
            else if(arr[i] < 0){
                sumOfminusElements++;
            }
            else{
              sumOfzeroElements++;  
            }
        }
        
        float proportion_of_positive_value = (float)sumOfplusElements / arraylength;
        float proportion_of_negative_value = (float)sumOfminusElements / arraylength;
        float proportion_of_zero = (float)sumOfzeroElements / arraylength;
        
        System.out.println(String.format( "%.6f", proportion_of_positive_value ));
        System.out.println(String.format( "%.6f", proportion_of_negative_value ));
        System.out.println(String.format( "%.6f", proportion_of_zero ));
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}