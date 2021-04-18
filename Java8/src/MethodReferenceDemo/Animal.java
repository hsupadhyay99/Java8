package MethodReferenceDemo;

public class Animal {
	
	private String name;
	private String food;
	
	public Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	public void print() {
		System.out.println(name+" eats "+food);
	}

}
