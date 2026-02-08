package com.java.String_Problems;

public class Check_Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}

		System.out.println(s.equals(reverse) ? "is a palindrome" : "Not a Palindrome");

	}

}
