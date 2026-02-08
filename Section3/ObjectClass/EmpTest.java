package april.Section3.ObjectClass;

public class EmpTest {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "shyam", 20);
		Emp e2 = new Emp(1, "shyam", 20);

		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2)); // compares the value in it after overriding

		System.out.println(e1.equals(new Employee(1, "Shyam", 20)));
	}

}
 