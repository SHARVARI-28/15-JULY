class Fruit {
	String name, taste, size;
	void eat() {
		System.out.println("Eating Fruits....");
		
	}
}

class Apple extends Fruit {
	Apple() {
		name = "Apple";
		taste = "Sweet";
	}
	
	void eat() {
		System.out.println(name + " is "+taste+" in taste.");
	}
}
class Orange extends Fruit {
	Orange(){
		name = "Orange";
		taste = "Sweeter";
	}
	
	void eat() {
		System.out.println(name + " is "+ taste +" in taste.");
	}
}

class Mango extends Fruit{
	Mango(){
		name="Mango";
		taste="Sweet and sour";
	}
	void eat() {
		System.out.println(name + " is " + taste+ " in taste ");
	}
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		Mango mango =new Mango();
		fruit.eat();
		apple.eat();
		orange.eat();
		mango.eat();
	}

}
