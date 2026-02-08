package java_codes_Objects_Constructors;

public class Student {
	int sid;
	String sname;
	int age;

	// without initializing
	Student() {

	}

	// initializing sid =1
	Student(int sid) {
		this.sid = sid;
	}

	// initializing sid = 2, name = shyam

	Student(int sid, String sname) {

		this.sid = sid;
		this.sname = sname;
	}

	// initializing sid =3, sname = sundar & age = 20

	Student(int sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

}
