package funcational.interfaceExp;

public class MathCalculatorImpl {

	public static void main(String[] args) {
		MathCalculator mathCalculator = (num1,num2) -> num1+num2;
		
		int sum  = mathCalculator.add(5, 10);
		System.out.println("Sum is "+sum);

	}

}
