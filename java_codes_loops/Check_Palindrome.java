package java_codes_loops;

import java.util.Scanner;

public class Check_Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		int sum = reverse(n);
		System.out.println(sum == n ? "it is palindrome" : "it is not a palindrome");
	}

	public static int reverse(int a) {
		int res = 0;
		while (a != 0) {
			res = res * 10 + a % 10;
			a /= 10;
		}
		return res;
	}

}
