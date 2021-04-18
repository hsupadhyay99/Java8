package funcational.interfaceExp;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String args[]) {
		Supplier<Double> randomGenerator = () -> new Random().nextDouble();
		System.out.println("Random 1:"+randomGenerator.get());
		System.out.println("Random 2:"+randomGenerator.get());
	}

}
