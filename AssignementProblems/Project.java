package april.AssignementProblems;

public class Project {

	String projectName;
	int ProjectID;

	Project(String projectName, int projectID) {
		this.projectName = projectName;
		this.ProjectID = projectID;
	}

	void projectDetails() {
		System.out.println("Project Name: " + projectName);
		System.out.println("Project ID: " + ProjectID);
	}

}
