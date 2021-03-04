package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam19/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
			String data1 = "안녕하세요";
			String data2 = "당신은 누구십니까?";
			
			/*os.write(data1.getBytes());
			os.write("\n".getBytes());
			os.write(data2.getBytes());
			os.flush();
			os.close();*/
		PrintStream out = new PrintStream(os);
		out.println(3);
		out.println(10.5);
		out.flush();
		out.close();
		
		
		
		
	}

}
