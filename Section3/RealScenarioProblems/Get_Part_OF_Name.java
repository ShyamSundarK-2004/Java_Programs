package april.Section3.RealScenarioProblems;

public class Get_Part_OF_Name {

	public static void main(String[] args) {

		String str = "Shyam Sundar K";
		int firstindex = str.indexOf(' ');
		int lastindex = str.lastIndexOf(' ');

		// first name
		String sub1 = str.substring(0, firstindex);
		System.out.println(sub1);

		// second name
		String sub2 = str.substring(firstindex + 1, lastindex);
		System.out.println(sub2);

		// last name
		String sub3 = str.substring(lastindex + 1);
		System.out.println(sub3);

	}

}
