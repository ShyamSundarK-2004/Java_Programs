package april.RelationshipProblems.Aggregation;

public class Car { // depending class

	String model;
	double price;
	Radio r;

	Car(String model, double price) {
		this.model = model;
		this.price = price;
	}

	void insertRadio(String radio) {
		r = new Radio();
		r.brand = radio;
	}

}
