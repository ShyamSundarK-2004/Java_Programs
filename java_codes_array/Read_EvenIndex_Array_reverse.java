package java_codes_array;

public class Read_EvenIndex_Array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = a.length - 2; i >= 0; i -= 2)
			System.out.print(a[i] + " ");

	}

}
