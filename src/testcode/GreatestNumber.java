package testcode;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
int y;
int z;

Scanner num = new Scanner(System.in);
System.out.println("Enter the first number: ");
x = num.nextInt();
System.out.println("Enter the second number: ");
y = num.nextInt()
;
System.out.println("Enter the third number: ");
z = num.nextInt();

if (x>y && x>z) { System.out.println("the greatest number is: "+x);

}
else if (y>x && y>z) {
	System.out.println("the greatest number is: "+y);
}
else
{
	System.out.println("the greatest number is: "+z);
}
	}

}
