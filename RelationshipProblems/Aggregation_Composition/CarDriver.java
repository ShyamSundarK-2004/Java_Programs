package april.RelationshipProblems.Aggregation_Composition;

public class CarDriver {

	public static void main(String[] args) {
		Car c = new Car();

		System.out.println(c.e);
		// composition so the object is created when the depending class object is
		// created
		System.out.println(c.r);
		// aggregation so the object is created once the method which creates the object
		// for the dependent class is called

		c.insertRadio("Sony");// the object creating class is called

		System.out.println(c.r);
		System.out.println(c.r.brand);
	}
}
