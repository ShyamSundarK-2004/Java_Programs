package object_Programs.Encapsulation;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person("Shyam", "abc@com", "xyz", 1234567890);

		System.out.println(p.name);
		System.out.println(p.email);
		// System.out.println(p.password);
		System.out.println(p.getPhone("abc@com", "xyz"));
	}

}
