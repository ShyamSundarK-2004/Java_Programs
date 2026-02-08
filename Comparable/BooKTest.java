package april.Comparable;

import java.util.Arrays;

public class BooKTest {

	public static void main(String[] args) { 
		
		Book[] book = { 
				new Book("Harry Potter", "JK Rowling", 2500),
				new Book("Java", "james Gosling", 3000),
				new Book("Dabba", "Shyam", 3500), 
				new Book("Salaar", "Neel", 700) 
				};
		
		System.out.println("Sorting based on Book Price");
		Arrays.sort(book);
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
		}
		
		
		
		
		
		
		

	}

}
