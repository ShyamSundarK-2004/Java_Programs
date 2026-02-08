package april.AssignementProblems;

import java.util.Scanner;

public class Reverse_Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse vowels : ");
		String s = sc.next();
		String result = "";

		char[] arr = s.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int left = 0, right = s.length() - 1;

		while (left < right) {
			if (!isVowel(arr[left], vowels)) {
				left++;
				continue;
			}
			if (!isVowel(arr[right], vowels)) {
				right--;
				continue;
			}

			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		for (char a : arr)
			result += a;
		System.out.println("Reversed word:" + result);

	}

	public static boolean isVowel(char c, char[] vowels) {
		for (char v : vowels) {
			if (c == v)
				return true;
		}
		return false;
	}
}
