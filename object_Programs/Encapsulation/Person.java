package object_Programs.Encapsulation;

public class Person {

	String name;
	String email;
	private String password;
	private long phone;

	Person(String name, String email, String password, long phone) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public long getPhone(String email, String password) {
		if (this.email == email && this.password == password)
			return phone;
		else
			return -1;
	}

}
