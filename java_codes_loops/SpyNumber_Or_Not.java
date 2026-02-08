package java_codes_loops;

import java.util.Scanner;

public class SpyNumber_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		int sum = Find_sum(n);
		int product = Find_product(n);

		System.out.println(sum == product ? " the given number is spynum." : " it is not a spynum");
	}

	public static int Find_sum(int a) {
		int rem = 0;
		while (a != 0) {
			rem += a % 10;
			a /= 10;
		}
		return rem;
	}

	public static int Find_product(int a) {
		int rem = 1;
		while (a != 0) {
			rem *= a % 10;
			a /= 10;
		}
		return rem;
	}

}
