package actual_test;

public class Dog extends Animal{

	public void eat() {
		System.out.println("dog eats bones");
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
	}
}
