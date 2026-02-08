package april.Section3.StringClass;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Madam, in Eden, I'm Adam";
		str.toLowerCase();
		String str2 = "";
		String str3 = "";

		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				str2 += str.charAt(i);
			}
		}

		for (int i = str2.length() - 1; i <= 0; i--) {
			str3 += str2.charAt(i);
		}

		System.out.println(str2.equals(str2) ? "palindrome" : "not a palindrome");

	}

}
