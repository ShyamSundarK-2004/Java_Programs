package april.Section3.ObjectClass;

public class Emp {

	int eid;
	String name;
	double salary;

	Emp(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public boolean equals(Object ref) {
		if (ref instanceof Emp) {
			Emp e = (Emp) ref;
			return eid == e.eid && name == e.name && salary == e.salary;
		}
		return false;
	}

}
