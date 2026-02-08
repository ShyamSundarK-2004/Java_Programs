package java_codes_loops;

import java.util.Scanner;

public class Sum_Of_Primenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();
		int total = 0;
		System.out.println("the sum of prime in between " + n1 + " and " + n2 + " is ");
		for (int i = n1; i <= n2; i++) {
			if (isprime(n1)) {
				total += n1;
			}
			n1++;
		}
		System.out.println(total);

	}

	public static boolean isprime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}