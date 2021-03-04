package ch18.exam16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) throws Exception {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam16/data.txt";
//		OutputStream os = new FileOutputStream(filePath);
		
//		String data = "오늘은 수요일이다.";
//		byte[] bytes = data.getBytes("UTF-8");
//		os.write(bytes);
//		os.flush();
//		
//		data = "오늘은 따뜻해횽";
//		bytes = data.getBytes("UTF-8");
//		os.write(bytes);
//		os.flush();
//		os.close();
		
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		String data = "오늘은 따듯하고 좋습니다.";
		writer.write(data);
		writer.write(data);
		writer.flush();
		writer.close();
		
		

	}

}
