package april.RelationshipProblems.IsARealtion.Inheritance;

public class Son extends Father {

	String name = "Allen";

	void displayFather() {
		System.out.println(super.name);
		// here the name should contain the parent class father name(Smith)
		// so we can use super keyword to call the parent class member when the parent
		// and child class varialbe name is same
	}

	void displaySonName() {
		System.out.println(name);
	}

}
