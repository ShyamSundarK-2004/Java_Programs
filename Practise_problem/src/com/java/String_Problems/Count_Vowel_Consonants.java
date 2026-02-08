package com.java.String_Problems;

public class Count_Vowel_Consonants {

	public static void main(String[] args) {

		String s = "Aeronautical Engineering";
		s.toLowerCase();

		int vowelcount = 0;
		int consonantcount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch > 'a' && ch < 'z')
				consonantcount++;
			else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowelcount++;
		}

		System.out.println("vowel Count: " + vowelcount);
		System.out.println("Consonant count: " + consonantcount);

	}

}
