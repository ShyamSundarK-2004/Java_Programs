package april.ExceptionHandling;

import java.util.Scanner;

public class Wish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("Handled");
			System.exit(0);
		} finally {
			System.out.println("Code get executed");
		}
		System.out.println("HI");
	}

}
