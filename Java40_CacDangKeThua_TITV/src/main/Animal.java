package main;

public class Animal {
	protected String Animal;

	public Animal(String animal) {
		super();
		Animal = animal;
	}

	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}
	
	public void eat()
	{
		System.out.println("I'm eating");
	}
	
}
