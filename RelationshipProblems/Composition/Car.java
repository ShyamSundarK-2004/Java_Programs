package april.RelationshipProblems.Composition;

public class Car { // depending class

	Engine e = new Engine(); // this is created and then return the engine object

	public static void main(String[] args) {
		Car c = new Car(); // first car object is created
		/*
		 * then the non static variable and methods are created and loaded in the heap
		 * area so the engine object is created then the print statement are printed
		 */
		System.out.println(c);
		System.out.println(c.e);
	}

}
