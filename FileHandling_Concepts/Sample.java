package april.FileHandling_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Shyam Sundar/OneDrive/Desktop/Stickers/New folder/Sample.txt");
		f.createNewFile();
		System.out.println("File exist: " + f.exists());
		FileInputStream fi = new FileInputStream(f);

		int ch = fi.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = fi.read();
		}
	}

}
