package Practise_Problems;

import java.util.Scanner;

public class Find_Digit_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = sc.nextInt();

		System.out.println(digitSum(n));

	}

	public static int digitSum(int n) {
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		return sum;

	}

}
