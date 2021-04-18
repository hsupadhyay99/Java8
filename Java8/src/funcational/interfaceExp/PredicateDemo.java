package funcational.interfaceExp;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (input) -> input%2 ==0;
		
		System.out.println("5 is even:"+isEven.test(5));
		System.out.println("12 is even:"+isEven.test(12));

	}

}
