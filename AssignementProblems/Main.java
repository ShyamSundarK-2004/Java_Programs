package april.AssignementProblems;

public class Main {
	public static void main(String[] args) {
		Bank atm = new ATM(); // upcasting (interface ref = new implementing class)
		atm.getMoney();
		atm.setMoney();
		atm.getMoney();
		atm.deposit(2000); // overriding method call
	}
}
