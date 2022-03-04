package testcode;

public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog(); // create object
		d.printColor();
	}

}
class Animal
{
	String color ="White";
	
}
class Dog extends Animal{
	String color = "Black";
	void printColor() {
		System.out.println(color);// print color of Dog class
		System.out.println(super.color);//print color of aNimal class
	}
}