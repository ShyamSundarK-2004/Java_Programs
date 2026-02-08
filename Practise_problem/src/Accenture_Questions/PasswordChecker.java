package Accenture_Questions;

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(CheckPassword(s, s.length()));

	}

	public static int CheckPassword(String str, int n) {
		if (n < 4)
			return 0;

		// Rule 5: First character must not be a digit
		if (Character.isDigit(str.charAt(0)))
			return 0;

		boolean hasDigit = false;
		boolean hasUpper = false;

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch))
				hasDigit = true;
			if (Character.isUpperCase(ch))
				hasUpper = true;
			if (ch == ' ' || ch == '/')
				return 0; // Rule 4
		}

		if (hasDigit && hasUpper)
			return 1;

		return 0;
	}
}
