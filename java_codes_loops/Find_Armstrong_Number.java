package java_codes_loops;

import java.util.Scanner;

public class Find_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for n:");
		int n = sc.nextInt();
		int originalnum = n;
		int temp = n;
		int digits = 0;
		while (temp != 0) {
			temp /= 10;
			digits++;
		}

		int result = Calculate_Power(originalnum, digits);

		System.out.println(result == n ? "it is a Armstrong Number" : "It is not a Armstrong Number");

	}

	public static int Calculate_Power(int num, int power) {
		int res = 0;
		int temp = num;
		while (temp != 0) { 
			int digit = temp % 10;
			res += Math.pow(digit, power);
			temp /= 10;
		}

		return res;
	}

}
