package java_codes;

import java.util.Scanner;

public class No_Of_Notes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount to check the no of notes:");
		int amt = sc.nextInt();

		if (amt != 0) {
			if (amt >= 500) {
				int noof500 = amt / 500;
				System.out.println("No. of 500 notes: " + noof500);
				amt %= 500;
			}
			if (amt >= 200) {
				int noof200 = amt / 200;
				System.out.println("No. of 200 notes: " + noof200);
				amt %= 200;
			}
			if (amt >= 100) {
				int noof100 = amt / 100;
				System.out.println("No. of 100 notes: " + noof100);
				amt%=100;
			}
			if (amt >= 50) {
				int noof50 = amt / 50;
				System.out.println("No. of 50 notes: " + noof50);
				amt %= 50;
			}
			if (amt >= 20) {
				int noof20 = amt / 20;
				System.out.println("nO. of 20 notes: " + noof20);
				amt %= 20;
			}
			if (amt >= 10) {
				int noof10 = amt / 10;
				System.out.println("No. of 10 notes: " + noof10);
				amt %=10;
			}
			if (amt >= 5) {
				int noof5 = amt / 5;
				System.out.println("No. of 5 notes: " + noof5);
				amt %=5;
			}
			if (amt >= 2) {
				int noof2 = amt / 2;
				System.out.println("No. of 2 notes: " + noof2);
				amt %=2;
			}
			if (amt >= 1) {
				int noof1 = amt / 1;
				System.out.println("No. of 1 notes: " + noof1);
				amt %=1;
			}

		}

	}

}
