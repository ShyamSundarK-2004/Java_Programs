package april.Comparable;

public class Person implements Comparable {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o) {
		Person p = (Person) o;
		if (this.age > p.age)
			return 10;
		else if (this.age == p.age)
			return 0;
		else
			return -1;
	}

	public String toString() {
		return "name=" + name + ", age=" + age;
	}

}
