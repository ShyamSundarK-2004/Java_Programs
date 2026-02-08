package april.Comparable;

public class Book implements Comparable {

	String title;
	String author;
	double price;

	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return "title=" + title + ", author=" + author + ", price=" + price;
	}

	// Sorting Based on book Price
	// public int compareTo(Object o) {
	// Book b = (Book) o;
	// if (this.price > b.price)
	// return 1;
	// else if (this.price == b.price)
	// return 0;
	// else
	// return -1;
	// }

	// Sorting Based on book title
	public int compareTo(Object o) {

		Book b = (Book) o;
		return this.title.compareTo(b.title);
	}

}
