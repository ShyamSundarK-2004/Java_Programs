package april.AssignementProblems;

import java.util.Arrays;

public class Is_String_Anagram {
//two strings which have the same characters
	public static void main(String[] args) {

		String s1 = "dad";
		String s2 = "add";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("it is anagram");
		} else {
			System.out.println("not a anagram");
		}

	}

}
