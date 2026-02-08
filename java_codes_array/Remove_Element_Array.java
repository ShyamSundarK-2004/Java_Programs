package java_codes_array;

import java.util.Scanner;

public class Remove_Element_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("enter element to remove");
		int ele = s.nextInt();
		int count = 0;
		for (int i : a)
			if (i == ele)
				count++;
		a = remove(a, count, ele);
		for (int i : a)
			System.out.println(i);

	}

	public static int[] remove(int[] a, int count, int ele) {
		int[] res = new int[a.length - count];
		int index = 0;
		for (int i : a)
			if (i != ele)
				res[index++] = i;
		return res;

	}
}