package funcational.interfaceExp;

import java.util.function.Consumer;

public class ConsumerIntegerDemo {

	public static void main(String[] args) {
		Consumer<Integer> doubleInputGenerator = (input) -> System.out.println("Double of input "+input+" is "+(input*2));
		doubleInputGenerator.accept(6);
		doubleInputGenerator.accept(15);

	}

}
