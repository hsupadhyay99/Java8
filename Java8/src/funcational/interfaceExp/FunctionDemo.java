package funcational.interfaceExp;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String,Integer> lengthChecker = (str) -> str.length();
		
		String input = "This is a test String";
		System.out.println("Length:"+lengthChecker.apply(input));

	}

}
