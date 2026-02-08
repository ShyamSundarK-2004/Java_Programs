package java_codes_array;

public class Read_OddIndex_Array {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 1; i < a.length; i += 2)
			System.out.print(a[i] + " ");
	}

}
