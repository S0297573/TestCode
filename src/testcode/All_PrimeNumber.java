package testcode;

public class All_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i = 2; i <=10; i++) {
		boolean Prime=true;
		
		for(int j =2;j<i;j++) {
			
			if (i%j == 0) {
				Prime=false;
				break;
			}
		}
		
		if(Prime) {
			System.out.println("Prime number: "+i);
			
		}
		else {
			System.out.println("Non prime number: "+i);
		}
	}
}}

