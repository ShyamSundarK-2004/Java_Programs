package java_codes_loops;

import java.util.Scanner;

public class ZigZag_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value of n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int count = 1;
			for (int j = 1; j <= n * 2; j++) {
				System.out.print(i <= j && count++ <= n ? "*" : "  ");

			}
			System.out.println();

		}

	}

}
