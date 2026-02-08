package april.Abstraction;

public class ApplicationTest {

	public static void main(String[] args) {
		Instagram i = new Instagram();
		i.login("shyam@1234", "1010");// this shows the implementation details so we need to hide

		// so to hide it we have to do upcasting
		Application a = new Instagram();
		a.login("shyam@1234", "1010");
	}

}
