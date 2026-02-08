package object_Programs.Encapsulation;

public class BagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag b = new Bag();

		b.setColor("Green");
		b.setPrice(2500);
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
		
		System.out.println("================");

		Bag b1 = new Bag();

		b1.setColor("White");
		b1.setPrice(5000);
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
	}

}
