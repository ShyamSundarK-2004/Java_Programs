package java_codes_loops;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int originalNum = n;
		int res = 0;
		int digits = 0;

		// finding the no of digits in the given number
		int temp = n;
		while (temp != 0) {
			temp /= 10;
			digits++;
		}

		// finding the power of the digits and adding to the res variable

		temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			res += Math.pow(digit, digits);
			temp /= 10;
		}

		// comparing the result and the original number
		System.out.println(res == originalNum ? originalNum + " is an Armstrong number"
				: originalNum + " is not an Armstrong number");

	}
}
//153,370,9474