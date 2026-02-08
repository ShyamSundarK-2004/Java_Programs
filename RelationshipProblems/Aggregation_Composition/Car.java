package april.RelationshipProblems.Aggregation_Composition;

public class Car {// depending class

	String model;
	String price;

	Engine e = new Engine();
	Radio r;

	void insertRadio(String brand) {
		r = new Radio();
		r.brand = brand;
	}

}
