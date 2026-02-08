package java_codes_loops;

import java.util.Scanner;

public class Palindrome_Within_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int end = sc.nextInt();

		System.out.println("Palindromic numbers in the range:");
		for (int i = start; i <= end; i++)
			if (isPalindrome(i))
				System.out.println(i);

	}

	public static boolean isPalindrome(int num) {
		int original = num;
		int reversed = 0;

		while (num != 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}

		return original == reversed;
	}
}
