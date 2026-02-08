package april.Section3.WrapperClass;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Byte b1 = 65;
		char c = (char) (b1.intValue());
		System.out.println(c);// A

		Integer a = 10;
		System.out.println(Integer.toBinaryString(a));// 1010
		String s = Integer.toBinaryString(a);
		System.out.println(Integer.parseInt(s));// 1011

		boolean D1 = Boolean.parseBoolean("adv");
		System.out.println(D1);// false

		System.out.println("Main End");
	}

}
