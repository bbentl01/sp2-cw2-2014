import org.junit.Test;


public class FractionCalculatorTest {

	@Test
	public void test() {
		FractionCalculator calc = new FractionCalculator();
		Fraction fr = new Fraction(1,2);
		System.out.println(calc.evaluate(fr,"+ 1/2 * 5 / 10"));
		System.out.println(calc.evaluate(fr,"+ 1/2"));
//		System.out.println(calc.evaluate(fr, "* 3"));
	}
	
/*	//This tests that the clearcalculator method is working
	public void test1(){
		FractionCalculator calc1 = new FractionCalculator();
		calc1.clearCalculator("c");
		calc1.getTotalFraction();
		System.out.println(calc1.getTotalFraction());
		//The result should be 0
	}
	
	//This test checks the Quit Method is working correctly
	public void test2(){
		FractionCalculator calc2 = new FractionCalculator();
		calc2.isQuit("q");
		//If GoodBye is printed success
	}*/
	
	
	}
