import java.io.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
    public static int numberOfturn = 0;
    
    public static int pageCount(int n, int p) {
        
        for (int i = 0; i <= n/2; i++) {
            if (p == i*2 || p == i*2+1) {
                numberOfturn = i;
                if (n/2 < p) {
                    numberOfturn = n/2 - numberOfturn; 
                } 
                break;
            } 
        }
        return numberOfturn;
    }

}

public class PageCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
