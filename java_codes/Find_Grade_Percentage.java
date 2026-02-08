package java_codes;

import java.util.Scanner;

public class Find_Grade_Percentage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark1:");
		int m1 = sc.nextInt();
		System.out.println("enter the mark2:");
		int m2 = sc.nextInt();
		System.out.println("enter the mark3:");
		int m3 = sc.nextInt();
		System.out.println("enter the mark4:");
		int m4 = sc.nextInt();
		System.out.println("enter the mark5s:");
		int m5 = sc.nextInt();

		int total = m1 + m2 + m3 + m4 + m5;
		System.out.println("Total marks:" + total);

		int average = total / 5;
		System.out.println("Average marks:" + average);

		if (average > 90 && average <= 100) {
			System.out.println("Grade : O");
		} else if (average > 80 && average <= 90) {
			System.out.println("Grade : A");
		} else if (average > 70 && average <= 80) {
			System.out.println("Grade : B");
		} else if (average > 60 && average <= 70) {
			System.out.println("Grade : C");
		} else {
			System.out.println("Fail");
		}

	}

}
