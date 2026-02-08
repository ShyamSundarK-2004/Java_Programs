package april.AssignementProblems;

public class ChiefMinister {

	String name;
	int experience;

	ChiefMinister(String name, int experience) {
		this.name = name;
		this.experience = experience;
	}

	void cmDetails() {

		System.out.println("CM Name: " + name);
		System.out.println("CM Experience " + experience);

	}
}
