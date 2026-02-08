package april.RelationshipProblems.Inheritance.SingleLevel;

public class Dog extends Animal {

	String breed;

	static void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		bark();
		eat();

	}

}
