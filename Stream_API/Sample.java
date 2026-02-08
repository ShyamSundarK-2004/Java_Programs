package april.Stream_API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println("Printing Stream");
		list.stream().forEach(n -> System.out.println(n));

		System.out.println("--filtering Stream with %20--");
		list.stream().filter((f) -> f % 20 == 0).forEach(n -> System.out.println(n));

		System.out.println("Using Map Method");
		list.stream().map((n) -> n * 2).forEach(System.out::println);

		System.out.println("----Stream String----");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Shyam");
		list1.add("Sundar");
		list1.add("Damu");
		list1.add("Allen");
		list1.add("Balaji");
		list1.add("Caren");

		list1.stream().filter((s) -> {
			return s.startsWith("A");
		}).forEach((str) -> System.out.println(str));

		System.out.println("--Filter based on length--");

		list1.stream().filter((s) -> s.length() <= 5).forEach((str) -> System.out.println(str));

		System.out.println("Map the elements with its double ");
		System.out.println("and then filter the num % 5 and then println the num");
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(10);
		list2.add(15);
		list2.add(25);
		list2.add(33);
		list2.add(53);
		list2.add(73);

		list2.stream().map((n) -> n * 2).filter((n) -> n % 5 == 0).forEach(System.out::println);

		System.out.println(list2.stream().count());

		System.out.println("Min Element in the list : " + list2.stream().min((a, b) -> a - b).get());
		System.out.println("Max Element in the list : " + list2.stream().max((a, b) -> a - b).get());
	}
}
