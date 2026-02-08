package java_codes;

import java.util.Scanner;

public class Check_Typeof_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to check the type of number whether +ve , -ve or zero
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to check the type(positive, negative or zero):");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("The number: "+n+" is negative." );
		}else if(n>0) {
			System.out.println("The number: "+n+" is positive." );
		}
		else {
			System.out.println("The number: "+n+" is Zero." );
		}

	}

}
