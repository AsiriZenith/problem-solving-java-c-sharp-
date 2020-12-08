import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase{

    // Complete the staircase function below.
    static void staircase(int n) {
        
        boolean accept = false;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(accept){
                   System.out.print("#");
                   continue; 
                }
                if(j==n-1-i){
                    System.out.print("#");
                    accept = true;
                }
                else{
                   System.out.print(" "); 
                }
            }
            System.out.println();
            accept = false;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}