package april.RelationshipProblems.Composition;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Shyam", 20, 12345678);

		System.out.println(p.getAadhaar());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAadhaar().getNumber());
	}
}
