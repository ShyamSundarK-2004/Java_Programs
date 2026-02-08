package java_codes;

import java.util.Scanner;

public class Check_typeof_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// check the given char is a alphabet , digit or a special character

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Character:");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("'"+ch+"'" + " is an alphabet.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("'"+ch+"'" + " is a number.");
		} else {
			System.out.println("'"+ch+"'"+ " is a special symbol.");
		}

	}

}
