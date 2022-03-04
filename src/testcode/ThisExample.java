package testcode;

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AB a = new AB(10); // created object with parameter
	}

}
class AB{
	AB(){
		System.out.println("hello a");
	}
	AB(int x){
		this();
		System.out.println(x);
	}
}