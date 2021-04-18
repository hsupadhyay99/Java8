package funcational.interfaceExp;

import java.util.function.Predicate;

public class PredicateStringDemo {

	public static void main(String[] args) {
		Predicate<String> startsWithHello = (str) -> str.startsWith("Hello");
		
		String input = "Hello World";
		System.out.println(input+" starts with Hello:"+startsWithHello.test(input));
		input = "Another String";
		System.out.println(input+" starts with Hello:"+startsWithHello.test(input));

	}

}
