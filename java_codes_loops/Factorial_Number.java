package java_codes_loops;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact*i;
		}
		System.out.println("the factorial of "+n+" is: "+fact);
	}

}
