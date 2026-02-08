package object_Programs.Encapsulation;

public class ProductTest {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.Name);
		System.out.println(p.getPrice());
		p.setPrice(-4500);
		System.out.println(p.getPrice());
	}
}
