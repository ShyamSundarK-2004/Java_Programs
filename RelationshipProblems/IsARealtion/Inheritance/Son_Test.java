package april.RelationshipProblems.IsARealtion.Inheritance;

public class Son_Test {

	public static void main(String[] args) {
		Son s = new Son();
		s.displayFatherName();// Smith
		s.displaySonName();// Allen

		s.displayFather();// Allen ----> Smith is the father name
		// so by using super keyword we can call the members of the parent class

	}

}
