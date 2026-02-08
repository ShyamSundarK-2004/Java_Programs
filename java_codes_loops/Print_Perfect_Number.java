package java_codes_loops;

import java.util.Scanner;

public class Print_Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();

		int sum = 0;

		// finding the factor and doing sum of the divisor
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println((n == sum ? n + ": perfect number" : n + ": is not a perfect number"));

	}

}
