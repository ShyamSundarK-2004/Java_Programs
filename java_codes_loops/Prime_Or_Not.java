package java_codes_loops;

import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		count++;
		System.out.println("The no of prime in that number: " + count);

	}

}
