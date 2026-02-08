package java_codes;

import java.util.Scanner;

public class Check_upperORlower_case {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a char to check whether it is upper or lower case:");
		
		char ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println(ch+" is lower case");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(ch+" is upper case");
		}
		else {
			System.out.println(ch+" is not a alphabet");
		}
		
		
	}

}
