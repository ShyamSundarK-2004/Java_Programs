package april.Stream_API;

import java.util.ArrayList;

public class CompareTwo_String {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aakash");
		list.add("vignesh");
		list.add("kapil");
		list.add("tuliyah");
		list.add("riya");
		list.add("abhiskeh");
		System.out.println("---Acending order---");
		list.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);

		System.out.println("---Descending order---");
		list.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
	}

}
