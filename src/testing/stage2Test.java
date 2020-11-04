package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stage2Test {

	@Test
	void test() {
		MathsGame game=new MathsGame();
		String output=game.stage2Test(153);
		assertEquals("FizzBuzz", output);
	}

	
	@Test
	void test1() {
		MathsGame game=new MathsGame();
		String output=game.stage2Test(3);
		assertEquals("Fizz", output);
	}

	
	@Test
	void test2() {
		MathsGame game=new MathsGame();
		String output=game.stage2Test(5);
		assertEquals("Buzz", output);
	}

	
	@Test
	void test3() {
		MathsGame game=new MathsGame();
		String output=game.stage2Test(15);
		assertEquals("FizzBuzz", output);
	}

	
	@Test
	void test4() {
		MathsGame game=new MathsGame();
		String output=game.stage2Test(35);
		assertEquals("FizzBuzz", output);
	}

}
