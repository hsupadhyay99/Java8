package optional;

import java.util.Optional;

public class OptionalMethods3Demo {

	public static void main(String[] args) {
		Optional<String> opStr = Optional.ofNullable("Hello World");
		Optional<String> result = opStr.filter(str -> str.startsWith("Hello"));
		System.out.println("Result is present:"+result.isPresent());
		System.out.println("Result:"+result.get());
		
		Optional<String> result2 = opStr.filter(str -> str.startsWith("World"));
		System.out.println("Result is present:"+result2.isPresent());

		Optional<String> opStr2 = Optional.ofNullable(null);
		Optional<String> result3 = opStr2.filter(str -> str.startsWith("Hello"));
		System.out.println("Result is present:"+result3.isPresent());
		
		Optional<Integer> opNum = Optional.ofNullable(5);
		Optional<Double> doubleResult = opNum.map(num -> num*2.5);
		System.out.println("Result is present:"+doubleResult.isPresent());
		System.out.println("Result:"+doubleResult.get());
		
		Optional<Integer> opNum2 = Optional.ofNullable(null);
		Optional<Double> doubleResult2 = opNum2.map(num -> num*2.5);
		System.out.println("Result is present:"+doubleResult2.isPresent());
		

	}

}
