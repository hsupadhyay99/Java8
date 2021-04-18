package MethodReferenceDemo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
	
	private Fruit fruit;

	public static void main(String[] args) {
		Fruit fruit;
		List<String> fruitNames = Arrays.asList("Mango","Banana","Apple","Orange");
		
//		List<Fruit>  fruits = fruitNames.stream().map(str -> new Fruit(str)).collect(Collectors.toList());// Using lambda expression
		List<Fruit>  fruits = fruitNames.stream().map(Fruit::new).collect(Collectors.toList()); //Using constructor reference
		fruits.forEach(fruit1 -> System.out.println("Fruit name is "+fruit1.getName()));
		
		//another example
//		Supplier<Date> dateGenerator = () -> new Date(); // Using lambda expression
		Supplier<Date> dateGenerator = Date::new;
		System.out.println("Current date is "+dateGenerator.get());
		

	}

}
