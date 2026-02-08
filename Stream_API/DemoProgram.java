package april.Stream_API;

import java.util.Arrays;

public class DemoProgram {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int product = Arrays.stream(arr).filter(a -> a % 2 == 0).reduce((a, b) -> a * b).getAsInt();

		System.out.println("Produt of even number in the array:" + product);
	}

}
