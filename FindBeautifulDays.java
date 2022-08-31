import java.io.*;

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
    public static int reverse, remainder, numbOfDays;
    public static boolean isBeautiful;
    
    public static int getReverseNumber(int numb) {
        reverse = 0;  
        while (numb != 0) {
           remainder = numb % 10;
           reverse = reverse * 10 + remainder;  
           numb = numb/10;     
        }
        return reverse;
    }

    public static int beautifulDays(int i, int j, int k) {
        numbOfDays = 0;
        for (int k2 = i; k2 <= j; k2++) {
            if ((k2 - getReverseNumber(k2))%k == 0) {
                numbOfDays++;
            }
        }
        return numbOfDays;
    }

}

public class FindBeautifulDays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
