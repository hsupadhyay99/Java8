package optional;

import java.util.Optional;

public class OptionalMethodsDemo {

	public static void main(String[] args) {
		Optional<String> opStr = Optional.ofNullable("Hello World");
		System.out.println("Present:"+opStr.isPresent());

		Optional<String> opStr2 = Optional.ofNullable(null);
		System.out.println("Present:"+opStr2.isPresent());
		
		Optional<String> opStr3 = Optional.ofNullable("Good Morning");
		String value = opStr3.get();
		System.out.println("Value:"+value);
		
//		Optional<String> opStr4 = Optional.ofNullable(null);
//		String value2 = opStr4.get();
//		System.out.println("Value:"+value2);
		
		Optional<String> opStr5 = Optional.ofNullable("Good Evening");
		opStr5.ifPresent(str -> System.out.println("Value using ifPresent:"+str));
		
		Optional<String> opStr6 = Optional.ofNullable(null);
		opStr6.ifPresent(str -> System.out.println("Value using ifPresent:"+str));
		
		
	}

}
