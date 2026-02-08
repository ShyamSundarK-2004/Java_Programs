package april.Abstraction;

public class SampleDriver {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.add(10, 20));
		// this is the implementation method but this should not be seen

		Sample s = new Demo(); // upcasting to parent class so the method implementation is hidden
		System.out.println(s.add(10, 20));
	}
}
