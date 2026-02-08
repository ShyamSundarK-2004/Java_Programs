package Accenture_Questions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter M:");
		int m = sc.nextInt();
		int sum = 0;
		int diff = 0;
		for (int i = 1; i <= m; i++) {
			if (i % n == 0) {
				sum += i;
			} else {
				diff += i;
			}
		}

		System.out.println(Math.abs(sum - diff));
	}

}
