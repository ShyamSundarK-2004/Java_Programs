package april.Comparable;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("smith", 27);
		Person p2 = new Person("Allen", 21);

		System.out.println(p1.compareTo(p2));
		System.out.println(p1);

	}

}
