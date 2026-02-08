package april.RelationshipProblems.IsARealtion.Inheritance;

public class Child extends Parent {

	static {
		System.out.println("static block - child");
	}

	public static void play() {
		System.out.println("from child play");
	}

}
