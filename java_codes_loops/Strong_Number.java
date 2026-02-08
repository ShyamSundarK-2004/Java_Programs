package java_codes_loops;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		System.out
				.println(is_strong_number(n) == n ? "the given number is strong number" : "it is not a strong number");

	}

	public static int is_strong_number(int num) {
		int rem = 0;
		int digit = 0;
		while (num != 0) {
			digit = num % 10;
			rem += factorial(digit);
			num /= 10;
		}
		return rem;
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
