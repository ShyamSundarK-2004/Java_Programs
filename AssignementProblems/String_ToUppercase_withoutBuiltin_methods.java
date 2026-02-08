package april.AssignementProblems;

import java.util.Scanner;

public class String_ToUppercase_withoutBuiltin_methods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Original String : " + str);
		System.out.println("UpperCased String :" + toUpperCase(str));

	}

	public static String toUpperCase(String str) {
		String res = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				res += (char) (ch - 32);
			} else {
				res += ch;
			}

		}
		return res;
	}

}
