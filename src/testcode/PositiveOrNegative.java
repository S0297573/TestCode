
package testcode;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);

System.out.println("Enter a number to check positive or negative?");
	int y = x.nextInt(); 
	
	if(y>0) {
		System.out.println("Number:" + y + " is positive ");
		}
	
		else if(y<0){
			System.out.println("Number: "+y+" is negative");
		
					}
	
		else{System.out.println("Number is zero");
			
			}
			
	}
	}


