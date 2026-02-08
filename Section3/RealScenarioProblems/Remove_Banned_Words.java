package april.Section3.RealScenarioProblems;

public class Remove_Banned_Words {

	public static void main(String[] args) {

		String str = " hello this is very bad app and the ui is ugly and i hate the app and performance";

		String[] bannedwords = { "bad", "ugly", "hate", "poor" };

		boolean flag = false;
		

		for (int i = 0; i < bannedwords.length; i++) {
			if (str.contains(bannedwords[i])) {
				flag = true;
			}
		}

		System.out.println(flag);
	}
}
