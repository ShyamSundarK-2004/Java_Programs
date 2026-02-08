package Accenture_Questions;

import java.util.Scanner;

public class ToggleStringCase {

	public static String changeCase(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch -= 32;
				res.append(ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				ch += 32;
				res.append(ch);
			} else {
				res.append(ch);
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();

		System.out.println("Toggled String : " + changeCase(s));

	}

}
