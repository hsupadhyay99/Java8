package MethodReferenceDemo;

import java.util.ArrayList;
import java.util.List;

public class ArbitraryMethodReferenceDemo {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal("cat","fish"));
		animals.add(new Animal("dog","bone"));
		animals.add(new Animal("cow","grass"));
		
		//using lambda expression
		//animals.forEach(animal -> animal.print());
		
		//using arbitrary method reference
		animals.forEach(Animal::print);
	}

}
