package java_codes_loops;

import java.util.Scanner;

public class Find_Next_Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();

		int count = 0;
		System.out.println("the next 20 prime number are: ");

		while (count < 20) {
			if (isprime(n)) {
				System.out.print(n + " ");
				count++;
			}
			n++;
		}
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