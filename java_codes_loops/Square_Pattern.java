package java_codes_loops;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value of n:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i == 0 || i == n - 1 || j == 0 || j == n - 1 ? "*" : "  ");

			}
			System.out.println();

		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i == 1 || i == n || j == 1 || j == n ? "*" : "  ");
			}
			System.out.println();

		}

	}

}
