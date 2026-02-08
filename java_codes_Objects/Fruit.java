package java_codes_Objects;

public class Fruit {
	
	String name = "Shyam";

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		Fruit f1 = f;
		Fruit f2 = f;
		Fruit f3 = f;
		System.out.println(f.name);
		System.out.println(f1.name);
		System.out.println(f2.name);
		System.out.println(f3.name);

	}

}
