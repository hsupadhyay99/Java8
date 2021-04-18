package funcational.interfaceExp;

public class StringLengthCalculatorImpl {

	public static void main(String[] args) {
		StringLengthCalculator strLengthCalulator = str -> System.out.println("Length of the String "+str+" is :"+str.length());
		
		strLengthCalulator.printLength("Hello World");
		
		strLengthCalulator.printLength("I'm testing lambda expressions");

	}

}
