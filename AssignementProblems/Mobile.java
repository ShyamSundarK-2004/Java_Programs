package april.AssignementProblems;

public class Mobile {
	String brand;
	int price;
	int ram;
	Battery battery = new Battery("Li-ion", 5000);

	Mobile(String brand, int price, int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	void mobileDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Price: ₹" + price);
		System.out.println("RAM: " + ram + "GB");
		battery.batteryDetails();
	}
}
