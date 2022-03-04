package testcode;

public class Animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog_2 d = new Dog_2(); // object is created
d.work();
	}

}

class Animal_2{
	void eat() {System.out.println("eating...");}
	
}
class Dog_2 extends Animal_2{
	void eat() {System.out.println("eating bread...");}
	void bark() { System.out.println("barking...");}
	void work() {
		super.eat();
		bark();
	}
}