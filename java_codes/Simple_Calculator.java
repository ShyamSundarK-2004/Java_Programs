package java_codes;

import java.util.Scanner;

public class Simple_Calculator {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("enter the second number:");
		int num2 = sc.nextInt();

		System.out.println("solution: " + operation(num1, num2));

	}

	public static int operation(int a, int b) {
		System.out.println("operation can be done! (+,-,*,/)");
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Remainder");

		System.out.println("Select an option from above");

		int ch = sc.nextInt();

		switch (ch) {

		case 1: {
			return a + b;
		}
		case 2: {
			return a - b;
		}
		case 3: {
			return a * b;
		}
		case 4: {
			return a / b;
		}
		case 5: {
			return a % b;
		}
		default: {
			return 0;
		}

		}

	}

}
