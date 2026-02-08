package com.java.String_Problems;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "Shyam";
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}

		System.out.println(reverse);
	}

}
