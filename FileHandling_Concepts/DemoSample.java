package april.FileHandling_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoSample {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Shyam Sundar/OneDrive/Desktop/Sample/Demo.txt");
		System.out.println(f.exists());

		FileOutputStream fos = new FileOutputStream(f);
		FileOutputStream fos1 = new FileOutputStream(f, true);

		String text = "Hello, this is the Sample text written to the file using java. ";
		String text1 = "Appended data to the file.";

		fos.write(text.getBytes());
		fos.close();
		fos1.write(text1.getBytes());
		fos1.close();

		FileInputStream fis = new FileInputStream(f);
		int ch = (char) fis.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = fis.read();
		}
		fis.close();

	}
}
