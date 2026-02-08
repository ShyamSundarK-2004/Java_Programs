package object_Programs.Encapsulation;

public class BranchTest {

	public static void main(String[] args) {
		Branch b = new Branch("Smith", 10121);
		System.out.println(b.getManager_name());
		System.out.println(b.getIfsc());
	}

}
