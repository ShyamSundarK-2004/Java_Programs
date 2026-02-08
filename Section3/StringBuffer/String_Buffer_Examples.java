package april.Section3.StringBuffer;

public class String_Buffer_Examples {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println("----------------");
		s1.append("1234567812345678");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println("----------------");
		s1.append("0");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
	}

}