package april.Section3.StringClass;

public class Count_NO_Vowels_Consonants {

	public static void main(String[] args) {
		String str = " hello I am Shyam Sundar";
		str = str.toLowerCase();
		int count_vowels = 0;
		int count_consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str.toLowerCase();
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count_vowels++;
			} else {
				if (ch >= 'a' && ch <= 'z')
					count_consonants++;
			}

		}

		System.out.println("Vowel count : " + count_vowels);
		System.out.println("Consonants count : " + count_consonants);
	}

}
