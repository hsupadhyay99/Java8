package funcational.interfaceExp;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal dog = () -> System.out.println("I am a dog");
		
		Animal horse = () -> System.out.println("I am a horse");
		
		Animal lion = () -> System.out.println("I am a lion");
		
		dog.printName();
		horse.printName();
		lion.printName();
		
		

	}

}
