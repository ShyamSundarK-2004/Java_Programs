package april.AssignementProblems;

//Bank interface
interface Bank {
	int money = 10000; // interface variables are always public static final

	void getMoney();

	void setMoney();

	void deposit(int amount); // abstract method
}

//ATM class implementing the Bank interface
class ATM implements Bank {

	private int accountBalance;

	public void getMoney() {
		System.out.println("ATM: Current balance is " + accountBalance);
	}

	public void setMoney() {
		accountBalance = money; // using the interface variable
		System.out.println("ATM: Balance set to " + accountBalance);
	}

	public void deposit(int amount) {
		accountBalance += amount;
		System.out.println("ATM: Deposited " + amount + ", New Balance: " + accountBalance);
	}
}
