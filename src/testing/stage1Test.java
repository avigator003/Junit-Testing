package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stage1Test {

	@Test                                              //First Test Case
	void test() {
	MathsGame maths=new MathsGame();	
	String output=maths.stage1Test(3);
	assertEquals("Fizz", output);               
	}
	
	
	 
	@Test                                              //Second Test Case
	void test1() {
	MathsGame maths=new MathsGame();	
    String output1=maths.stage1Test(5);
	assertEquals("Buzz", output1);    
	}
	
	@Test                                             //Third Test Case
	void test2() {
	MathsGame maths=new MathsGame();	

    String output2=maths.stage1Test(8);
	assertEquals("8", output2); 
	}

	

}
