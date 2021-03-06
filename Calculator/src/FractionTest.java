import org.junit.Test;

/**
 * @author Bradd Bentley
 *
 */
public class FractionTest {

	@Test
	public void test() {
		// test divide by zero - should print an error and exit
        new Fraction(1, 0);
		// test multiply
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
        // test equals
		test1(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
		test1(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
		test1(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
		test1(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
		test1(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
		// test divide
		Fraction i = new Fraction(6,5);
		Fraction j = new Fraction(3,5);
		Fraction k = new Fraction(1,2);
		if (!i.equals(j.divide(k))) System.out.println("Divide failed");
		// test addition
		Fraction l = new Fraction(11,10);
		Fraction m = new Fraction(3,5);
		Fraction n = new Fraction(1,2);
		if (!l.equals(m.addition(n))) System.out.println("Addition failed");
		// test addition
		Fraction o = new Fraction(1,10);
		Fraction p = new Fraction(3,5);
		Fraction q = new Fraction(1,2);
		if (!o.equals(p.subtraction(q))) System.out.println("Subtraction failed");
		// test to string method
		Fraction r = new Fraction(3,1);
		System.out.println(r);	
		// test absolute value
		Fraction s = new Fraction(-3,1);
		System.out.println(s.absValue());
		//test negate value
		Fraction t = new Fraction(-4,2);
		System.out.println(t.negate());
		Fraction u = new Fraction(4,2);
		System.out.println(u.negate());
		}
    
	public void test1(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}

	
