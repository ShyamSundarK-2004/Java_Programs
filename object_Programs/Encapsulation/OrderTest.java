package object_Programs.Encapsulation;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o = new Order();

		o.setProduct_name("Camera");
		o.setProduct_id("twedf223433");
		o.setPrice(60000);
		o.setPayment("Phonepe");

		System.out.println(o.getProduct_name() + " " + o.getProduct_id() + " " + o.getPrice() + " " + o.getPayment());

		Order o1 = new Order();
		
		o1.setProduct_name("GoPro_hero11");
		o1.setProduct_id("5r55t43j9c");
		o1.setPrice(52000);
		o1.setPayment("cash On Delivery");

		System.out.println(o1.getProduct_name() + " " + o1.getProduct_id() + " " + o1.getPrice() + " " + o1.getPayment());

	}

}
