package java_codes_Objects_NonStatic;

public class Student {
	int sid;
	String sname;
	int age;

	Student() {

	}

	// initializing sid =3, sname = sundar & age = 20

	Student(int sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	void modify(String sname) {

		this.sname = sname;
		System.out.println("the name of the student has been changed");
	}

	void display() {
		System.out.println("sid: " + sid);
		System.out.println("name: " + sname);
		System.out.println("age: " + age);
	}

}
