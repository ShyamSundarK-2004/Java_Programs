package april.AssignementProblems;

import java.util.*;

public class TheDistance {

	public static int theMaximumDistance(String s) {
		int maxDistance = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j)) {
					maxDistance = Math.max(maxDistance, Math.abs(i - j));
				}
			}
		}

		return maxDistance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String s = sc.nextLine();

		int result = theMaximumDistance(s);
		System.out.println(result);
	}
}