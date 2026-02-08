package java_codes_loops;

import java.util.Scanner;

public class Xylem_And_Phloem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input a number
		System.out.println("Enter a number: ");
		int number = Math.abs(scanner.nextInt()); // Handle negative numbers

		int extremeSum = 0, middleSum = 0;
		int firstDigit = number % 10; // Get the last digit (rightmost)
		extremeSum += firstDigit;
		number /= 10;

		while (number >= 10) { // Process middle digit888s
			middleSum += number % 10;
			number /= 10;
		}

		extremeSum += number; // Add the first digit (leftmost)

		// Determine if the number is Xylem or Phloem
		if (extremeSum == middleSum) {
			System.out.println("Xylem number");
		} else {
			System.out.println("Phloem number");
		}
	}
}