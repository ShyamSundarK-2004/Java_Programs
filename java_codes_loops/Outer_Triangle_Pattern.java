package java_codes_loops;

import java.util.Scanner;

public class Outer_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value of n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				System.out.print(i + j == n + 1 || j - i == n - 1 || i == n ? '*' : ' ');
			}
			System.out.println();

		}

	}

}
