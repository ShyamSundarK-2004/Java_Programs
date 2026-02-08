package april.Stream_API;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	String designation;
	double salary;

	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name='" + name + '\'' + ", designation='" + designation + '\'' + ", salary=" + salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name)
				&& Objects.equals(designation, employee.designation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, designation, salary);
	}
}
