package testcode;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number to check prime number(must be greater than 1): ");
		int num = a.nextInt();

		int count = 0;
		int i;

		for (i = 1; i <= num; i++) {
			int x = num % i;
			if (x == 0) {
				count++;
			}

		}
		if (count > 2) {

			System.out.println("it is not a prime number");
		} else {
			System.out.println("it is a prime number");
		}

	}

}
