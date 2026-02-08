package java_codes_loops;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + " " + b + " ");
		for (int i = 1; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

}
