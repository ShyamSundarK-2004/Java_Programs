package april.Comparator;

public class Person {
	String name;
	int height;

	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String toString() {
		return "Name: "+name+" "+"Height: "+height;
	}
}
