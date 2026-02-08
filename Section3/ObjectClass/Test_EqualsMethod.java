package april.Section3.ObjectClass;

public class Test_EqualsMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shyam", 20);
		Employee e2 = new Employee(2, "Sundar", 10);

		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}
}