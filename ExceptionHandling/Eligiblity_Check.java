package april.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eligiblity_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		if (age < 18) {
			throw new InputMismatchException("You are not eligible to vote");
		} else {
			System.out.println("You are eligible to vote");
		}
	}
}