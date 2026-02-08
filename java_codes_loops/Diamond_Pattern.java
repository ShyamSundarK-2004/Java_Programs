package java_codes_loops;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value for n:");
		int n = sc.nextInt();

		System.out.println("print diamond pattern but not in odd places");
		for (int i = 1; i < n * 2; i++) {
			for (int j = 1; j < n * 2; j++) {
				System.out.print(i <= n ? (i + j > n && j - i < n && (i + j) % 2 != 0 ? "*" : "  ")
						: (i + j < n * 3 && i - j < n && (i + j) % 2 != 0 ? "*" : "  "));
			}
			System.out.println();
		}

		System.out.println("print diamond pattern");
		for (int i = 1; i < n * 2; i++) {
			for (int j = 1; j < n * 2; j++) {
				System.out.print(
						i <= n ? (i + j > n && j - i < n ? "*" : "  ") : (i + j < n * 3 && i - j < n ? "*" : "  "));
			}
			System.out.println();
		}

		System.out.println("outer diamond");
		for (int i = 1; i < n * 2; i++) {
			for (int j = 1; j < n * 2; j++) {
				System.out.print(i <= n ? (i + j == n + 1 || j - i == n - 1 ? "*" : "  ")
						: (i + j == n * 3 - 1 || i - j == n - 1 ? "*" : "  "));
			}
			System.out.println();
		}
	}

}
