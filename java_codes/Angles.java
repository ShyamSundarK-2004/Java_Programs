package java_codes;

import java.util.Scanner;

public class Angles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st angle:");
		int a1 = sc.nextInt();
		System.out.println("enter 2nd angle:");
		int a2 = sc.nextInt();
		System.out.println("enter 3rd angle:");
		int a3 = sc.nextInt();
		
		int total_angle = a1+a2+a3;
		
		if(total_angle ==180) {
			System.out.println("then it is a valid triangle.");
		}
		else {
			System.out.println("it is not a valid triangle.");
		}
		
		
		
	}

}
