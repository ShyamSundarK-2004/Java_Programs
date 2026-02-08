package java_codes_Objects;

import java.util.Scanner;

public class String_Class {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int res = 0;
		int digits = 0;

		// finding the no of digits in the given number

		while (n != 0) {
			n /= 10;
			digits++;
		}

		// finding the power of the digits and adding to the res variable

		while (n != 0) {
			int digit = n % 10;
			res += Math.pow(digit, digits);
			n /= 10;
		}

		// comparing the result and the original number
		System.out.println(res == n ? " is an Armstrong number" : " is not an Armstrong number");

	}

}
