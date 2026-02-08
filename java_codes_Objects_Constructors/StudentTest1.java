package java_codes_Objects_Constructors;

public class StudentTest1 {
	public static void main(String[] args) {
		// without initalizing
		Student s1 = new Student();

		// initializing sid =1
		Student s2 = new Student(1);

		// initializing sid =2, sname = shyam
		Student s3 = new Student(2, "shyam");

		// initializing sid =3, sname= sundar , age =20
		Student s4 = new Student(3, "sundar", 20);

		// displaying the data from the diffrent constructors

		System.out.println(s1.sid + " , " + s1.sname + " , " + s1.age);

		System.out.println(s2.sid + " , " + s2.sname + " , " + s2.age);

		System.out.println(s3.sid + " , " + s3.sname + " , " + s3.age);

		System.out.println(s4.sid + " , " + s4.sname + " , " + s4.age);

	}

}
