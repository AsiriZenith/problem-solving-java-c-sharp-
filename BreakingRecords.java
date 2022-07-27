import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
    static int bestRecord = 0;
    static int worstRecord = 0;
    static int currentMaxRecord = 0;
    static int currentMinRecord = 0;
        
    public static List<Integer> breakingRecords(List<Integer> scores) {
        currentMaxRecord = scores.get(0);
        currentMinRecord = scores.get(0);
        List<Integer> result = new ArrayList<>();
        
        scores.stream().forEach(score->{
            if (score > currentMaxRecord) {
                bestRecord++;
                currentMaxRecord = score;
            } else if (score < currentMinRecord) {
                worstRecord++;
                currentMinRecord = score;
            }
        });
        
        result.add(bestRecord);
        result.add(worstRecord);
        
        return result;
    }

}

public class BreakingRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
