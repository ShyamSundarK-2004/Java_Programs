package april.AssignementProblems;

public class Anagram_String {
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";

		boolean flag = false;
		for (int i = 'a'; i <= 'z'; i++) {
			if (s.contains(i + "")) {
				break;
			}
		}
		if (flag)
			System.out.println("string is anagram");
		else
			System.out.println("Not a anagram");
	}

}
