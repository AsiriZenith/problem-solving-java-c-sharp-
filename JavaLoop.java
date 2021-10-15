import java.util.*;
import java.io.*;

class JavaLoop{
    public static int count = 0;
    public static int output = 0;
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            print(a,b,n);
            System.out.println();
            count = 0;
            output = 0;
        }
        in.close();
    }
    
    public static void print(int a, int b, int n) {
        for(int i=0; i<n; i++) {
            
            if (i == 0) {
               count = a + (int)Math.pow(2, i) * b; 
            } else {
                count = (int)Math.pow(2, i) * b;
            }
            
            output += count;
            System.out.print(output);
            System.out.print(" ");
        }
    }
}