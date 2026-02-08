package java_codes_array;

public class Sum_Of_Evenindex_Arrays {
	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i += 2) {
			// can be increment directly by  i +=2 so the i increse in the multiple of 2 or
			res += arr[i];
			// we can use conditional statement but the above method is more efficient
			// res += i % 2 == 0 ? arr[i] : 0;

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("sum of array at the even index position:");
		System.out.println(sumArray(a));

	}

}
