package basics;

public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to create variable to to store int, float, char, boolean, double

		int a = 10;
		float b = 2.5f;
		char c = 'a';
		boolean d = true;
		double e = 10.25;

		System.out.println("Integer: " + a);
		System.out.println("Float: " + b);
		System.out.println("Character: " + c);
		System.out.println("Boolean: " + d);
		System.out.println("Double: " + e);

		// for swapping two data without 3rd variable

		int num1 = 10;
		int num2 = 15;
		System.out.println("Before Swap: " + num1 + " " + num2);
		// Swap logic...

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swap: " + num1 + " " + num2);

	}

}
