package april.AssignementProblems;

public class State {

	String stateName;
	double stateIncome;
	ChiefMinister cm;

	State(String stateName, double stateIncome) {
		this.stateName = stateName;
		this.stateIncome = stateIncome;
	}

	void selectCM() {
		System.out.println("State Name: " + stateName);
		System.out.println("State Income: " + stateIncome);
		cm = new ChiefMinister("Shyam", 10);
		cm.cmDetails();
	}

}
