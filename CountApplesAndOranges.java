public class CountApplesAndOranges
{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int numberOfApples = 0;
        int numberOforanges = 0;
        
        //get new locations for Apple
        for(int i=0;i<apples.length;i++)
        {
            apples[i] = apples[i] + a;
            if(apples[i]>=s && apples[i]<=t){
                numberOfApples++;
            }
        }
        //get new locations for Oranges
        for(int i=0;i<oranges.length;i++)
        {
            oranges[i] = oranges[i] + b;
            if(oranges[i]<=t && oranges[i]>=s){
                numberOforanges++;
            }
        }
        System.out.println(numberOfApples);
        System.out.println(numberOforanges);
    }
	public static void main(String[] args) {
		int[] apples = {2,3,-4};
		int[] oranges = {3,-2,-4};
		int a = 4;
		int b = 12;
		int s = 7;
		int t = 10;
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
}