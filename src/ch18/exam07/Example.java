package ch18.exam07;

import java.io.FileReader;
import java.io.Reader;

public class Example {

	private static Reader reader;

	public static void main(String[] args) {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam07/data.txt";
		try {
			reader = new FileReader(filePath);
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				if(charCode == -1) break;
				System.out.print((char) charCode);
				
			}
			reader.close();
		} catch(Exception e) {
			e.printStackTrace();	
		}
		
		

	}

}
