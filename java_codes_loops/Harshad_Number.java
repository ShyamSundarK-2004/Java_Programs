package java_codes_loops;

import java.util.Scanner;

public class Harshad_Number {

	public static void main(String[] args) {
		// n =18 => 1+8=> 9 => 18%9 ==0 ==> harshad number

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for n:");
		int n = sc.nextInt();

		int temp = n;
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println(n % sum == 0 ? "it is a harshad number" : "it is not a harshad number");

	}

}
