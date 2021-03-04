package ch18.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class Example {

	private static Writer writer;

	public static void main(String[] args) {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam09/data.txt";
		try {
			writer = new FileWriter(filePath);
			writer.write(new char[] {'A', '한', '글', '짱'});
			writer.write(new char[] {'B', 'C', 'D', 'E'}, 0, 2);
			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();
			
			writer.close();
			
		} catch(Exception e) {
			e.printStackTrace();	
		}
		
		

	}

}
