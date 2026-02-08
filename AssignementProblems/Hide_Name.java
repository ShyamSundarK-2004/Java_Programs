package april.AssignementProblems;

public class Hide_Name {

	public static void main(String[] args) {
		String s = "test@gmail.com";

		String[] str = s.split("@");
		String sr = "";
		for (int i = 0; i < str[0].length() - 2; i++) {
			sr += "*";
		}

		System.out.println(str[0].charAt(0) + sr + str[0].charAt(str[0].length() - 1) + "@" + str[1]);
	}

}
