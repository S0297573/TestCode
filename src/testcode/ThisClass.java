package testcode;

public class ThisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a =new A();
		a.n();
	}

}

class A{
	void m() {
		System.out.println("hello m");
		
	}
	
	void n() {
		System.out.println("hello n");
		m();
		this.m();
	}
}
