package april.RelationshipProblems.IsARealtion.Inheritance;

public class Student1 extends Person {

	int sid;

	Student1(String name) {
		super(name);
		this.name = name;
	}

	Student1(String name, int sid) {
		 this(name);
		this.name = name;
		this.sid = sid;
	}

}
