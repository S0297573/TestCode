package testcode;

public class WAP_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Ex = "abbc";
		for(int i=0;i<=Ex.length();i++) {
			for(int j=i+1;j<=Ex.length();j++) {
				System.out.println(Ex.substring(i,j));
			}
		}
	}

}


//WAP for Substring? Ex- String = abbc, in output- a
//ab
//abb
//abbc
//b
//bb
//bbc
//b
//bc
//c
