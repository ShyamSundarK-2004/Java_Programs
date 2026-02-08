package april.AssignementProblems;

public class ProjectManager {

	String name;
	int empID;
	Project project;

	ProjectManager(String name, int empID) {
		this.name = name;
		this.empID = empID;
	}

	void Complete_Project() {
		System.out.println("Manager Name: " + name);
		System.out.println("Employee ID: " + empID);
		project = new Project("Java Application", 12345679);
		project.projectDetails();
	}

}
