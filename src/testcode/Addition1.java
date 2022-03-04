package testcode;

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 19;
		int b = 5;
		
		//method call
		int c = add(a,b);
		
		System.out.println("sum of a and b = "+c);
	}

	// user defined method
	public static int add(int n1,int n2) {
		// n1 and n2 are formal parameters
		
		int s;
		s=n1+n2;
		return s;
	}
}
