package april.Stream_API;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(15);
		list.add(10);
		list.add(25);
		list.add(33);
		list.add(53);
		list.add(33);
		list.add(73);

		// removes duplicates
		System.out.println("remove duplicates from the stream: ");
		list.stream().distinct().forEach(System.out::println);

		// sort the stream elements
		System.out.println("Sort the element in the stream: (comparable is called by default)");
		list.stream().sorted().forEach(System.out::println);

		// sort the stream elements
		System.out.println("Sort the element in the stream: (comparator)");
		list.stream().sorted((a, b) -> a - b).forEach(System.out::println);

		System.out.println("Sort the element in the stream descending: (comparator)");
		list.stream().sorted((a, b) -> b - a).forEach(System.out::println);

		System.out.println("give the limit to the stream to print");
		list.stream().limit(4).forEach(System.out::println);

		System.out.println("Reduce elements from the list to single element: ");
		System.out.println(list.stream().reduce((a, b) -> a + b).get());

	}

}
