package ch18.exam08;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	private static Reader reader;

	public static void main(String[] args) {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam08/data.txt";
		try {
			reader = new FileReader(filePath);
			char[] data = new char[1024];
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data,0 ,readNum);
			}
			System.out.println(str);
			reader.close();
		} catch(Exception e) {
			e.printStackTrace();	
		}
		
		

	}

}
