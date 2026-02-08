package april.Section3.WrapperClass;

public class Sample {
	public static void main(String[] args) {
		// boxing or auto boxing
		int a = 10;
		Integer a1 = Integer.valueOf(a);
		Integer b = 10;

		System.out.println(a1);

		Object[] o1 = new Object[5];

		// unboxing
		Integer s = 100;
		int s1 = s;// implicit
		System.out.println(s1);

		Integer s2 = 100;
		int s3 = (int) s2;// explicit
		System.out.println(s3);

		Integer b1 = 10;
		Object q = (Number) b1;
		System.out.println(q);
		Object q1 = (Integer) b1;
		System.out.println(q1);

		char c = (char) (b1.intValue());
		System.out.println(c);

	}
}
