import java.util.*; 

public class Grading Students
{
	 
    public static void gradingStudents(List<Integer> grades){
        for(int i=0;i<grades.size();i++){
            System.out.print(grades.get(i)+" ");
        }
        System.out.println();
        
        int numberOfStudents = grades.get(0);
        
        int mark;
        int n;
        int m;
        
        List<Integer> list = new ArrayList<Integer>(); 
        
        for(int i=0;i<=numberOfStudents;i++){
            mark = grades.get(i);
            // System.out.print(mark+" ");
            if(mark%5 == 0 || mark<38){
              list.add(mark);
              continue;
            }
            else{
                n = (mark+5)/5;
                n *= 5;
                m = n - mark;
                if(m < 3)
                {
                    mark = n;
                }
            
                list.add(mark);
            }
        }
        //return list;
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
	public static void main(String[] args) {
		int[] array={4,73,67,38,33};
		
		List<Integer> list=new ArrayList<Integer>(); 
		for(int element:array)
		{  
            list.add(element);  
        }  
        
        gradingStudents(list);
	}

}
