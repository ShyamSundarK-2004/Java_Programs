package java_codes_Objects_Constructors;

public class Book1 {
	String title;
	String author;
	double price;

	Book1(String title, String author, double price) {
		// use this keword if the local and object variable name is same
		// here the this=> repersent the current address of the object variable
		this.title = title;
		this.author = author;
		this.price = price;

	}

}
