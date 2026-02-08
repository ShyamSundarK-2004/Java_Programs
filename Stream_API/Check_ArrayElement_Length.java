package april.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check_ArrayElement_Length {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };

		List<int[]> list = Arrays.asList(nums);
		
		for(int[] a : list)
			System.out.println(a.toString());
	}

}
