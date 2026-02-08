package java_codes_loops;

import java.util.Scanner;

public class Reverse_The_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();

		String sum = reverse(n);
		System.out.println("After reversing the number: " + sum);
		// to check whether the reversed number is palindrome or not
		// we can use the parseInt method that is in Interger class to convert the
		// String data to integer and compare the data to find palindrome

	}

	public static String reverse(int a) {
		String res = "";
		while (a != 0) {
			res += a % 10;
			a /= 10;
		}
		return res;
	}

}
