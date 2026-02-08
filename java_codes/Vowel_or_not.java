package java_codes;

import java.util.Scanner;

public class Vowel_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character to check:");
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			
			switch (ch) {
			case 'a', 'A': {

				System.out.println(ch + " is vowel.");
				break;
			}
			case 'e', 'E': {
				System.out.println(ch + " is a vowel.");
				break;
			}
			case 'i', 'I': {
				System.out.println(ch + " is vowel.");
			}
			case 'o', 'O': {
				System.out.println(ch + " is vowel.");
				break;
			}
			case 'u', 'U': {
				System.out.println(ch + " is vowel.");
				break;
			}

			default:
				System.out.println(ch + " is a consonant.");
			}
		}
		else {
			System.out.println("Given input is not a valid character...");
		}

	}

}
