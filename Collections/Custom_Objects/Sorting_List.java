package april.Collections.Custom_Objects;

import java.util.Comparator;

public class Sorting_List implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		if (e1.salary > e2.salary) {
			return 10;
		} else if (e1.salary == e2.salary) {
			return 0;
		} else {
			return -10;
		}
	}

}
