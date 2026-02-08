package april.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num1 :");
			int num1 = sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2 = sc.nextInt();
			int q = num1 / num2;
			System.out.println("Quotient is ");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception Handled ");
		}
		System.out.println("Main Ends");

	}

}
