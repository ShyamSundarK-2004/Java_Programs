package java_codes;

import java.util.Scanner;

public class Roots_Of_QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 3 value(a,b,c) to find the roots:");
		System.out.println("Enter value for a:");
		int a = sc.nextInt();
		System.out.println("Enter value for b:");
		int b = sc.nextInt();
		System.out.println("Enter value for c:");
		int c = sc.nextInt();
		
		int d = b*b -4*a*c;
		System.out.println("the descriminator: "+d);
		
		double root1,root2;
		
		if(d>0) {
			root1 = -b + (Math.sqrt(d))/2*a;
			System.out.println("the first root is: "+root1);
			root2 = -b -(Math.sqrt(d))/2*a;
			System.out.println("the second root is: "+root2);
			
		}
		else if(d==0) {
			root1 = -b/2*a;
			System.out.println("the first root is: "+root1);
			root2 = -b/2*a;
			System.out.println("the second root is: "+root2);
		}
		else {
			double realpart = -b/2*a;
			double imag_part1 =(Math.sqrt(-d))/2*a;
			System.out.println("the first root is: "+realpart+" + "+imag_part1+"i");
			double imag_part2 = (Math.sqrt(-d))/2*a;
			System.out.println("the second root is: "+realpart+" - "+imag_part2+"i");
			
			
		}
		
		

	}

}
