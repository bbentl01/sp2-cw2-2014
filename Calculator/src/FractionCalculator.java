/**
 * Created by Bradd Bentley for the second coursework assignment.
 */

public class FractionCalculator {

	private static String input;
	
	//Initially set calculator to 0
	private static Fraction totalfr = new Fraction(0,1);
	
    public Fraction getTotalFraction() {
        return totalfr;
    }
    
    public void setTotalFraction(Fraction frac) {
        totalfr = frac;
    }
    
    public String getInput(){
    	return input;
    }
    
    public void setInput(String str){
    	input = str;
    }
    
	
	public static void main(String args[]){
		

		
		// Provide welcome message
		System.out.println("Hello, this is Bradd Bentley's Fraction Calculator");

		FractionCalculator fc = new FractionCalculator();
		
		while(fc.isQuit(input) == false){
			fc.clearCalculator(input);
			fc.evaluate(totalfr, input);
			System.out.println(fc.getTotalFraction());
		}
	

	}

	public Fraction evaluate (Fraction frac, String inputString){
		
		frac = totalfr;
		Fraction newfr = null;
		
		String str = inputString;
		String[] input = str.split("\\s+");
		
		for(int i = 0; i < input.length; i += 2){
			    //this checks for fractions for the odd inputs in the string
				if(input[i].contains("/")&& input[i].length()>1){
					int first = Integer.parseInt(input[i].substring(0,(input[i].indexOf("/"))));
					int second = Integer.parseInt(input[i].substring(input[i].indexOf("/")+1,input[i].length()));
					newfr = new Fraction(first,second);
				}
				if(isNumber(input[i].toString()) == true ){
					int first = Integer.parseInt(input[i]);
					int second = 1;
					newfr = new Fraction(first,second);
				}
				if(input[i+1].contains("/")&& input[i+1].length()>1){
					int first = Integer.parseInt(input[i+1].substring(0,(input[i+1].indexOf("/"))));
					int second = Integer.parseInt(input[i+1].substring(input[i+1].indexOf("/")+1,input[i+1].length()));
					newfr = new Fraction(first,second);
				}
				if(isNumber(input[i+1].toString()) == true ){
					int first = Integer.parseInt(input[i+1]);
					int second = 1;
					newfr = new Fraction(first,second);
				}
				if(input[i].contains("+")){
					totalfr = totalfr.addition(newfr);
				}
				if(input[i+1].contains("+")){
					totalfr = totalfr.addition(newfr);
				}
				if(input[i].contains("-")){
					totalfr = totalfr.subtraction(newfr);
				}
				if(input[i+1].contains("-")){
					totalfr = totalfr.subtraction(newfr);
				}
				if(input[i].contains("*")){
					totalfr = totalfr.multiply(newfr);
				}
				if(input[i+1].contains("*")){
					totalfr = totalfr.multiply(newfr);
				}
				if(input[i].contains("/") && input[i].length()==1){
					totalfr = totalfr.divide(newfr);
				}
				if(input[i+1].contains("/") && input[i+1].length()==1){
					totalfr = totalfr.divide(newfr);
				}
				if(input[i].contains("a")||input[i].contains("A")||input[i].contains("Abs")){
					totalfr = totalfr.absValue();
				}
				if(input[i+1].contains("a")||input[i+1].contains("A")||input[i+1].contains("Abs")){
					totalfr = totalfr.absValue();
				}
				if(input[i].contains("n")||input[i].contains("N")||input[i].contains("Neg")){
					totalfr = totalfr.absValue();
				}
				if(input[i+1].contains("n")||input[i+1].contains("N")||input[i+1].contains("Neg")){
					totalfr = totalfr.absValue();
				}
		}
		return totalfr;

		}
		
	public static boolean isNumber(String string){
		try{
			Integer.parseInt(string);
		}catch (Exception e){
			return false;
		}
		return true;
		
	}
	
	public void clearCalculator(String inputString){
		String str = inputString;
		
		String[] input = str.split("\\s+");
		
		for(int i = 0; i < input.length; i++){
			if(input[i].toString() == "c" || input[i].toString() == "C" || input[i].toString() == "clear"){
				//set FractionCalculator to 0/1
				FractionCalculator fc = new FractionCalculator();
				fc.setTotalFraction(new Fraction(0,1));
			}
		}
	}
	
	public boolean isQuit(String inputString){
		String str = inputString;
		
		String[] input = str.split("\\s+");
		
		for(int i = 0; i < input.length; i++){
			if(input[i].toString() == "q" || input[i].toString() == "Q" || input[i].toString() == "quit"){
				//Provide exit message
				System.out.println("Goodbye");
				System.exit(0);
				return true;
			}
		}
		return false;
	}
	
	}
	

