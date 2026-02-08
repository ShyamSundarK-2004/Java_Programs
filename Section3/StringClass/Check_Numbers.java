package april.Section3.StringClass;

public class Check_Numbers {

	public static void main(String[] args) {
		String str = "1234a5";
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				b = true;
			} else {
				b = false;
				break;
			}
		}

		System.out.println(b);

	}

}
