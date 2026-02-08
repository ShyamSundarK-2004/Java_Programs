package april.Abstraction.Interface;

public class Instagram implements App {

	public void login(String email, String password) {
		if (this.email == email && this.password == password) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login failed");
		}
	}

}
