package april.Comparator;

import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {

		Student[] s = { new Student(1, "Shyam", 93), new Student(2, "Sundar", 66), new Student(3, "Allen", 85),
				new Student(4, "Smith", 30) };

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// sorting based on marks
		Arrays.sort(s, new MarkChecker());
		System.out.println("After sorting based on Marks...");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		// sorting based on sid
		Arrays.sort(s, new SIDChecker());
		System.out.println("After sorting based on SID...");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
