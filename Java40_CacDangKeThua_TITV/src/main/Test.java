package main;

public class Test {
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.eat();
//		d.bark();
		
		BabyDog bbd = new BabyDog();
		bbd.eat();
		bbd.bark();
		bbd.wheep();
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Bird b = new Bird();
		b.eat();
		b.fly();
	}
}
