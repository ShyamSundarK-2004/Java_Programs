package april.AssignementProblems;

import java.util.Scanner;

public class String_ToLowercase_withoutBuiltin_methods2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Original String : " + str);
		System.out.println("LowerCased String :" + toLowerCase(str));

	}

	public static String toLowerCase(String str) {
		String res = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				res += (char) (ch + 32);
			} else {
				res += ch;
			}

		}
		return res;
	}

}
