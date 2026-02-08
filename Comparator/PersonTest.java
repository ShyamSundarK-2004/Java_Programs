package april.Comparator;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {

		Person[] p = { 
				new Person("Shyam", 180), 
				new Person("Sundar", 150),
				new Person("Sam", 210),
				new Person("Smith", 140) 
				};
		HeightChecker hc = new HeightChecker();
		Arrays.sort(p,hc);
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}

	}

}
