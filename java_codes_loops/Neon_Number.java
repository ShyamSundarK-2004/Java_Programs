package java_codes_loops;

import java.util.Scanner;

public class Neon_Number {
//9*9 = 81 and 8+1=9 then it is neon number
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		int square_num = n * n;
		System.out.println(sum(square_num) == n ? " it is a neon number" : "it is not a neon number");

	}

	public static int sum(int a) {
		int res = 0;
		while (a != 0) {
			res += a % 10;
			a /= 10;
		}
		return res;

	}

}
