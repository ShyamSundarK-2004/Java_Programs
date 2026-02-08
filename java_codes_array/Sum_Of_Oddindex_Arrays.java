package java_codes_array;

public class Sum_Of_Oddindex_Arrays {
	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			// can be increment with i +=2 or
			// we can use conditional statement but the above method id more efficient
			res += i % 2 != 0 ? arr[i] : 0;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("sum of array at the odd index position:");
		System.out.println(sumArray(a));

	}

}
