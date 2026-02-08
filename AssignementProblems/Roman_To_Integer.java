package april.AssignementProblems;

import java.util.Scanner;

public class Roman_To_Integer {

	public static int romanToInt(String s) {
		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			int currValue = getValue(ch);

			if (currValue < prevValue) {
				result -= currValue;
			} else {
				result += currValue;
			}

			prevValue = currValue;
		}

		return result;
	}

	public static int getValue(char ch) {
		if (ch == 'I')
			return 1;
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman to change to Integer: ");
		String s = sc.next();

		if (!s.isEmpty()) {
			System.out.println("Roman: " + s + " => Integer: " + romanToInt(s.toUpperCase()));
		}
	}
}
