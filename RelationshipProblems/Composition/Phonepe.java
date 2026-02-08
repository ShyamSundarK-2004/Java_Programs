package april.RelationshipProblems.Composition;

public class Phonepe { // depending class

	String upiID;
	long phoneno;

	BankAccount b = new BankAccount(123456789);

	Phonepe(String upiId, long phoneno) {
		this.upiID = upiId;
		this.phoneno = phoneno;
	}

	public static void main(String[] args) {
		Phonepe p = new Phonepe("ABAC123C", 1234455545);

		System.out.println(p.upiID + "  " + p.phoneno);
	}

}
