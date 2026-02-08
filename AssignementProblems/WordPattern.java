package april.AssignementProblems;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));

	}

	public static boolean wordPattern(String pattern, String s) {
		String[] str = s.split(" ");
		if (pattern.length() != str.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			for (int j = i + 1; j < pattern.length(); j++) {
				if (pattern.charAt(i) != pattern.charAt(j)) {
					if (str[i].equals(str[j])) {
						return false;
					}
					continue;
				}
				if (pattern.charAt(i) == pattern.charAt(j)) {
					if (!(str[i].equals(str[j]))) {
						return false;
					}
				}

			}
		}
		return true;

	}

}
