package april.Comparator;

import java.util.Comparator;

public class SIDChecker implements Comparator {
	// compare based on marks
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.sid - s2.sid;

	}

}
