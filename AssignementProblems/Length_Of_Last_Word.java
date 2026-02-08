package april.AssignementProblems;

import java.util.Scanner;

public class Length_Of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println("Entered Word is : " + s);
		int count = 0;
		int last = s.length() - 1;

		while (last >= 0) {
			if (s.charAt(last) == ' ') {
				last--;
				continue;
			} else {
				break;
			}
		}

		while (last >= 0) {
			if (s.charAt(last) != ' ') {
				count++;
				last--;
			} else {
				break;
			}
		}

		System.out.println(count);

	}

}
