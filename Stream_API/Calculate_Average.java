package april.Stream_API;

import java.util.ArrayList;

public class Calculate_Average {

//	public static void main(String[] args) {
//
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//
//		int sum = list.stream().reduce((n, m) -> n + m).get();
//		int count = (int) list.stream().count();
//		System.out.println(sum / count);
//	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Java");
		list.add("Carrot");
		list.add("canon");
		list.add("Cartoon");
		list.add("Apple");

		list.stream().map(str -> str.toUpperCase()).filter(str -> str.startsWith("C")).forEach(System.out::println);
	}
}
