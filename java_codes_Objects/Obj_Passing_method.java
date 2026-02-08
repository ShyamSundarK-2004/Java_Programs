package java_codes_Objects;

public class Obj_Passing_method {
	
	String name;
	String author_name;
	double price;
	
	public Obj_Passing_method(String name, String author_name, double price) {
		this.name = name;
		this.author_name = author_name;
		this.price = price;
	}
	
	public static void display_prop(Obj_Passing_method obj) {
		
		System.out.println(obj.name);
		System.out.println(obj.author_name);
		System.out.println(obj.price);
		
	}
	
	
	

}
