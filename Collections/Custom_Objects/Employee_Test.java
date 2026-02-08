package april.Collections.Custom_Objects;

import java.util.*;

public class Employee_Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		list.add(new Employee(1, "Smith", 10));
		list.add(new Employee(5, "Watson", 50));
		list.add(new Employee(4, "Sundar", 40));
		list.add(new Employee(3, "Shyam", 30));
		list.add(new Employee(2, "Allen", 20));

		for (Employee e : list) {
			System.out.println(e);
		}
//		System.out.println("---basic cotains, indexOF, remove----");
//		list.contains(new Employee(2, "Allen", 20));
//		list.indexOf(new Employee(3, "Shyam", 30));
//		list.remove(new Employee(5, "Watson", 50));
//
//		for (Employee e : list) {
//			System.out.println(e);
//		}
//		System.out.println("--Removing a random index---");
//
//		int removeElements = 3;
//		Employee temp = null;
//
//		Iterator i = list.iterator();
//
//		while (i.hasNext()) {
//			Employee e = (Employee) i.next();
//			if (e.eid == removeElements) {
//				temp = e;
//
//			}
//		}
//		list.remove(temp);
//
//		for (Employee e : list) {
//			System.out.println(e);
//		}
//		System.out.println("---Sorting List using Collections.sort Comparable method-----");
//
//		Collections.sort(list);
//
//		for (Employee e : list) {
//			System.out.println(e);
//		}
		System.out.println("---Sorting List using Collections.sort Comparator method-----");
		Collections.sort(list, new Sorting_List());
		
		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
