package ch18.exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {
	public static void main(String[] args) throws Exception {
		String inFilePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam06/photo2.jpg";
		String outFilePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam06/photo3.jpg";
		
		InputStream is = new FileInputStream(inFilePath);
		OutputStream os = new FileOutputStream(outFilePath);
		
		// 변수 초기화
		byte[] data = new byte[1024];
		int readNum = -1;
		while((readNum = is.read(data)) != -1) {
			os.write(data, 0 , readNum);
		}
		os.flush();
		
	    is.close();
		os.close();
		
	}

}
