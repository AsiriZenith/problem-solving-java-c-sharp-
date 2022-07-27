public class LargeNumFactorial
{
    int result[] = new int[400];  
    
    public int factorial(int num) {
        
        result[0] = 1;  
        int resultSize = 1;    
        
        for (int f = 2; f <= num; f++) {  
            resultSize = multiply(f, result, resultSize);  
        } 
        
        return resultSize;  
    }
    
    static int multiply(int y, int result[], int resultSize) {
        
        int c = 0;
        
        for (int j = 0; j < resultSize; j++) {  
            int product = result[j] * y + c;  
            result[j] = product % 10;  
            c = product / 10;  
        } 
        
        while (c != 0) {  
            result[resultSize] = c % 10;  
            c = c / 10;  
            resultSize = resultSize + 1;  
        }  
        
        return resultSize;  
    }  
    
    
	public static void main(String[] args) {
	    
		int num = 100;
		
		LargeNumFactorial obj = new LargeNumFactorial(); 
		
		int resSize = obj.factorial(num);  
		
		System.out.println("The factorial of the number " + num + " is: ");  
		
		for(int j = resSize - 1; j >= 0; j--) {  
            System.out.print(obj.result[j]);  
        }
        
	}
}
