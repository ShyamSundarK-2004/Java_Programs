package april.RelationshipProblems.Aggregation;

public class PhoneDriver {

	public static void main(String[] args) {
		Phone p = new Phone();

		System.out.println(p);
		System.out.println(p.sim);
		p.insertSim();
		System.out.println(p.sim);

	}

}
