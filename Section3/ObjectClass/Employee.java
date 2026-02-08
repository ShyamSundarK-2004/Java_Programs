package april.Section3.ObjectClass;

public class Employee {

	int eid;
	String name;
	double salary;

	Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "eid=" + eid + ", name=" + name + ", salary=" + salary;
	}

}
