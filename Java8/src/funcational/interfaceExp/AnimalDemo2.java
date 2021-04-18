package funcational.interfaceExp;

public class AnimalDemo2 {
	
	public static void printNameOfAnimal(Animal animal) {
		animal.printName();
	}

	public static void main(String[] args) {
		printNameOfAnimal(() -> System.out.println("I am a dog"));
		printNameOfAnimal(() -> System.out.println("I am a horse"));
		printNameOfAnimal(() -> System.out.println("I am a lion"));

	}

}
