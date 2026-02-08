package april.FileHandling_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f = new File("C:/Users/Shyam Sundar/OneDrive/Desktop/Sample/Demo.txt");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		Person p = new Person("Shyam", 20);
		oos.writeObject(p);
		Person p1 = new Person("Sundar", 24);
		oos.writeObject(p1);
		oos.writeObject(new Person("Smith", 34));
		System.out.println("Object written");
		System.out.println("=============");
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		Person pread = (Person) ois.readObject();
		while (pread != null) {
			System.out.println(pread);
			try {
				pread = (Person) ois.readObject();
			} catch (Exception e) {
				break;
			}
		}

		ois.close();
	}

}
