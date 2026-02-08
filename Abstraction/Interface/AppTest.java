package april.Abstraction.Interface;

public class AppTest {

	public static void main(String[] args) {
		Object i1 = new Instagram();
		Instagram i = new Instagram();
		i.login("shyam@1234", "1010");// this shows the implementation details so we need to hide

		// so to hide it we have to do upcasting
		App a = new Instagram();
		a.login("shyam@1234", "1010");
	}

}
