package object_Programs.Encapsulation;

public class Product {
	public String Name = "Smart Phone";
	private double price = 1000;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("Invalid Data");
	}
}
