
/**
 * CountingValleys
 */
public class CountingValleys {

    public int countingValleys(int steps, String path) {
        // Write your code here
        int stepup = 1;
        int stepdown = -1;
        int count = 0;
        int preCount = 0;
        int result = 0;
            
        for(int i=0; i<steps; i++) {
            preCount = count;
            if (path.charAt(i) == 'U') {
                count = count + stepup;
            } else if (path.charAt(i) == 'D') {
                count = count + stepdown;
            } else {
                System.out.println("Wrong Input!!");
            }

            if (preCount<0 && count==0) {
                result++;
            }
        }
        return result;        
    }

    public static void main(String[] args) {

        String path = "UDDDUDUU";
        int steps = 8;    
        
        CountingValleys countingValleys = new CountingValleys();
        System.out.println(countingValleys.countingValleys(steps, path));;
    }
}