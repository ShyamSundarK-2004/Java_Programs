package april.Collections.Custom_Objects;

import java.util.Comparator;

public class Employee implements Comparable {
	int eid;
	String name;
	double salary;

	Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return eid + " " + name + " " + salary;
	}

	public boolean equals(Object o) {
		Employee e = (Employee) o;

		return this.eid == e.eid && this.name.equals(e.name) && this.salary == e.salary;
	}

	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.eid - e.eid;
	}

}
