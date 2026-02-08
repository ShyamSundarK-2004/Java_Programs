package april;

public class Book {

	String title = "HP";
	String author = "JKR";
	double price = 10;
}

class BookObject{
	public static void main(String[] args) {
		Book data = new Book();
		System.out.println(data.author);
		System.out.println(data.title);
		System.out.println(data.price);
	}
}
