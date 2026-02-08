package java_codes_Objects_NonStatic;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a name to change:");
		String name = sc.nextLine();

		Student s1 = new Student(3, "sundar", 20);
		// display the data inside the object non static variables using nonstatic
		// methods
		s1.display();
		System.out.println();
		// modifing the non static variables using the non static methods
		s1.modify(name);
		System.out.println();
		// display the data inside the object non static variables using nonstatic
		// methods
		s1.display();

	}

}
