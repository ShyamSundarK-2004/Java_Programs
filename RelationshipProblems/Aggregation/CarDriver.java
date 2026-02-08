package april.RelationshipProblems.Aggregation;

public class CarDriver {

	public static void main(String[] args) {
		Car c = new Car("BMW", 1500000);

		System.out.println(c);
		System.out.println("before creating a lazy instantiation");
		System.out.println(c.r);
		// null because the object is created only in the method so once the method is
		// called the object for the dependent class is created
		System.out.println(c.model);// BMW
		System.out.println(c.price);// 1500000
		System.out.println("After creating a lazy instantiation");
		c.insertRadio("Bose");
		System.out.println(c.r);// the method is called and the object for the dependent class is created
		System.out.println(c.r.brand);// accessing the dependent class properties
	}
}
