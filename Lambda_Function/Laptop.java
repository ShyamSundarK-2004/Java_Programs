package april.Lambda_Function;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop {
	String name;
	int price;

	public Laptop(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop Name:  " + name + " | Laptop Price: " + price;
	}

	public static void main(String[] args) {
		ArrayList<Laptop> list1 = new ArrayList<Laptop>();
		list1.add(new Laptop("HP", 100000));
		list1.add(new Laptop("Dell", 85000));
		list1.add(new Laptop("Lenovo", 78000));
		list1.add(new Laptop("Apple", 150000));
		list1.add(new Laptop("Asus", 72000));

		ArrayList<Laptop> list2 = new ArrayList<Laptop>();
		list2.add(new Laptop("Acer", 69000));
		list2.add(new Laptop("MSI", 95000));
		list2.add(new Laptop("Samsung", 88000));
		list2.add(new Laptop("Microsoft", 130000));
		list2.add(new Laptop("LG", 80000));

		// sort based on price using lambda function
		Collections.sort(list1, (a, b) -> a.price - b.price);

		// sort based on name using lambda function
		Collections.sort(list2, (a, b) -> a.name.compareTo(b.name));
		for (Laptop laptop : list2) {
			System.out.println(laptop);
		}
	}
}
