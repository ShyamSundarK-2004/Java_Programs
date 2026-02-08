package april.RelationshipProblems.IsARealtion.Inheritance;

class Cardiologist extends Doctor { // the properties and behavior is inherited from the parent

	static void Bypass() { // this is a additional behavior of the child class

		System.out.println("perform bypass");
	}

	public static void main(String[] args) {
		check_BP();
		check_pulse();
		Bypass();
	}
}
