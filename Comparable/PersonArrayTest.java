package april.Comparable;

import java.util.Arrays;

public class PersonArrayTest {

	public static void main(String[] args) {
		Person[] people = { new Person("smith", 30),
				new Person("Allen", 27), 
				new Person("Shyam", 12),
				new Person("Veer", 20) 
				};
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}

		Arrays.sort(people);
		System.out.println("After sorting array");
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}

	}

}
