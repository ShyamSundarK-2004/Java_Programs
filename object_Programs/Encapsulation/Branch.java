package object_Programs.Encapsulation;

public class Branch {

	private String manager_name;
	private int ifsc;

	Branch(String manager_name, int ifsc) {
		this.manager_name = manager_name;
		this.ifsc = ifsc;
	}

	public String getManager_name() {
		return this.manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public int getIfsc() {
		return this.ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

}
