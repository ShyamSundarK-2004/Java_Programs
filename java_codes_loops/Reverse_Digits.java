package java_codes_loops;

import java.util.Scanner;

public class Reverse_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		String rev = "";
		while (n > 0) {
			rev += n % 10;
			n /= 10;
		}
		System.out.print("the reverse of the given number is : " + rev);
	}

}
