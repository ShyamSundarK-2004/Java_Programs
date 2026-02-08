package april.Polymorphism.MethodOverRiding;

class SampleTest {
	public static void main(String[] args) {

		Sample s = new Sample();
		int parent_sum = s.add(10, 20);
		System.out.println(parent_sum);

		System.out.println("================");

		Demo d = new Demo();
		int child_sum = d.add(20, 30);
		System.out.println(child_sum);

		System.out.println("===============");

		Sample s1 = new Demo(); // upcasting
		int sum = s1.add(10, 40);
		System.out.println(sum);
	}

}