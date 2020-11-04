package testing;

public class MathsGame {
     public static void main(String args[])
	{
	stage1();
    }
     
     // Function To Print The Desired Output
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
	  
	  
	  //J unit Testing  Stage 1
	  
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
	  
	  
	  //J unit Testing  Stage 2

	  public static String stage2Test(int i)
	  {
	      if(i%3==0 && i%5==0)
    		  return "FizzBuzz";
    	  else if(i%5==0)
    	  {
    		  int num=i;
    		  while(num>0)
    		  {
    			  if(num%10==3)
    		          return "FizzBuzz";
    				num/=10;  
    		  }
    		  return "Buzz";
    	  }
    	  else if(i%3==0)
    	  {
    		  int num=i;
		  while(num>0)
		  {
			  if(num%10==5)
		          return "FizzBuzz";
				num/=10;  
		  }
			  return "Fizz";
    	  }
    	  else {
    		  int num=i;
    		  while(num>0)
    		  {
    			  if(num%10==3)
    			  {
    				  if(num%10==5)
    					  return "FizzBuzz";
    				  else
    					  return "Fizz";
    			  }
    			  else if(num%10==5)
    			  {
    				  if(num%10==3)
    					  return "FizzBuzz";
    				  else
    					  return "Buzz";
    			  }
    			  num=num/10;
    			  }
    				  
    		  }
	      return ""+i;
    	  }
	      
		
	  
}
