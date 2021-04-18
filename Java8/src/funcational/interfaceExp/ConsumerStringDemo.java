package funcational.interfaceExp;

import java.util.function.Consumer;

public class ConsumerStringDemo {

	public static void main(String[] args) {
		Consumer<String> stringLengthPrinter = (str) -> System.out.println("Length of input String "+str+" is "+str.length());
		
		stringLengthPrinter.accept("Hello World");

	}

}
