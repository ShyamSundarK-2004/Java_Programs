package april.Abstraction;

public class Instagram extends Application {

	void login(String email, String password) {
		if (super.email == email && super.password == password) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login failed");
		}
	}

}
