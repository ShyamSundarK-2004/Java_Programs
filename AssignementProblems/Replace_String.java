package april.AssignementProblems;

public class Replace_String {
	public static void main(String[] args) {

		int count = 0;
		String[] str = { "shyamson@gmail.com", "test@yahoo.com", "demo@gmail.com" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].contains("@gmail.com")) {
				str[i] = str[i].replace("gmail.com", "yahoo.com");
				count++;
			}
		}
		System.out.println("Email Which Changed");
		for (String s : str)
			System.out.println(s);

		System.out.println("================");
		System.out.print("Email changed : ");
		System.out.println(count);

	}
}