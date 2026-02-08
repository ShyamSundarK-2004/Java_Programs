package java_codes_array;

public class Maximum_value_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1,12 , 9, 4, 5 };
		int max = Integer.MIN_VALUE;//some 214cr 
		
		for(int i = 0 ;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
