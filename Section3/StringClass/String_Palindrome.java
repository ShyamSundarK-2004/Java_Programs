package april.Section3.StringClass;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println(str.equals(rev) ? str + " is a Palindrome" : str + " not a palindrome");
	}

}
