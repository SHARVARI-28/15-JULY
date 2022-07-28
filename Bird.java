class Animal{
	
	void eat() {
		System.out.println("Animal eat");
	}
	
	void sleep() {
		System.out.println("Animal Sleep");
	}
}

public class Bird extends Animal{
	
	void eat() {
		System.out.println("Bird eat");
	}
	
	void sleep() {
		System.out.println("Bird Sleep");
	}
	
	void fly() {
		System.out.println("Bird fly");
	}
	
	public static void main(String[] args) {
	
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}

