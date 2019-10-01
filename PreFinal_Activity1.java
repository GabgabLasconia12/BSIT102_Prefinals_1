import java.util.*;


public class PreFinal_Activity1
{

    public static void main(String[] args)
    {
    	
   			 Scanner scan = new Scanner(System.in);
   			 String unitarray[] = {" ","one","two","three","four","five", "six", // this a the array or set of string that contain 1-19 numbers
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                      "eighteen", "nineteen" };
             String tensArray[] = {" ","ten", "twenty", "thirty", "fourty", "fifty",// this a the array or set of string that contain 10 - ninety  numbers
                      "sixty", "seventy", "eighty", "ninety" };
                     
             String words ="";System.out.println("Enter a number: ");
    			int num = scan.nextInt();// it is where the user enter a number 
    
				
   			// this for conditional statement
   			 if(num <= 19)
    {
    		//this is to get the first number I converted it to string and get the first value
      		int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
      		// Then I used the firstnum which is the converted number and used the index
    		System.out.println(unitarray[num]);
    }
    		else if(num <=99)
    {
    		//this is to get the first and second number then i convert it to string and get their values
    		int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
    		int secondtnum = Integer.parseInt(Integer.toString(num).substring(1,2));
    		// then I used the 2 different integer to determine the position
    		System.out.println(tensArray[firstnum]+" "+unitarray[secondtnum]);
    }
    		else if(num <= 999)
    	{
    		//this is to get the first,second,third number then I converted it to string and get the first,second and thrid value
    		int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
			int secondtnum = Integer.parseInt(Integer.toString(num).substring(1,2));
   			int tnum = Integer.parseInt(Integer.toString(num).substring(2,3));
   			// I used the 2 string and the 3 integers to determine the position and I add the hundred word
   			System.out.println(unitarray[firstnum]+" "+"hundred"+" "+tensArray[secondtnum]+" "+ unitarray[tnum]);
    }
    		else
    {
    		
    		int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
    		// since the limit is 1000 i used only one string and one integer and add the thoussand word
    		System.out.println(unitarray[firstnum]+" "+"thousand");
    }
 
    
   
    }
   
   
}