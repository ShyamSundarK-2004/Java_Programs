package java_codes_loops;

import java.util.Scanner;

public class Print_Diagonal_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int num = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i == j || i + j == num ? '*' : ' ');
			}
			System.out.println();
		}

	}

}
