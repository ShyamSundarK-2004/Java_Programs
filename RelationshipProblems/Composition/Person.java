package april.RelationshipProblems.Composition;

public class Person {

	String name;
	int age;
	Aadhaar aadhaar;

	Person(String name, int age, int number) {
		this.name = name;
		this.age = age;
		aadhaar = new Aadhaar(number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Aadhaar getAadhaar() {
		return aadhaar;
	}

}
