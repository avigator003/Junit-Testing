package testing;

public class MathsGame {

	public static void main(String args[])
	{
	stage1();
   }
	  public static void stage1() {
          for(int i=1;i<101;i++)
          {
        	  if(i%3==0 && i%5==0)
        		  System.out.println("FizzBuzz");
        	  else if(i%5==0)
        		  System.out.println("Buzz");
        	  else if(i%3==0)
        		  System.out.println("Fizz");
        	  else 
        	  	  System.out.println(i);
          }
       }
	  public static String stage1Test(int i)
	  {
		  if(i%3==0 && i%5==0)
    		  return "FizzBuzz";
    	  else if(i%5==0)
    		  return "Buzz";
    	  else if(i%3==0)
    		  return "Fizz";
    	  else 
    	  	  return ""+i;
      }
	  

}
