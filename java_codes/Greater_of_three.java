package java_codes;

import java.util.Scanner;

public class Greater_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("enter the third number:");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("the num: " + num1 + " is the greater");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("the num: " + num2 + " is the greater");
		} else {
			System.out.println("the num: " + num3+ " is the greater");
		}

	}

}
