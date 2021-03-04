package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam02/data.txt";
		
		try {
			InputStream is = new FileInputStream(filePath);
			byte[] data = new byte[1024];
			/*while(true) {
				int readNum = is.read(data);
				for(int i =0; i < readNum; i++) {
					System.out.print((char) data[i]);
				}
				if(readNum == -1) {
					break;
				}
			}*/
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				for(int i=0; i < readNum; i++) {
					System.out.print((char) data[i]);
				}
				System.out.println();
				
			}
			is.close();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
