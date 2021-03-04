package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam05/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath, true);
//			String data = "dsfsdfjsd";
			byte[] arr = {65,66,67};
			os.write(arr);
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
