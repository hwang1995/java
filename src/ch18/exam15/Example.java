package ch18.exam15;

import java.io.File;
import java.io.IOException;

public class Example {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sungwookhwang/Documents/data.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		file = new File("/Users/sungwookhwang/Documents/dir1/dir2/dir3");
		if(!file.exists()) {
//			file.mkdir();
			file.mkdirs();
		}
		
		file = new File("/Users/sungwookhwang/Documents/data.txt");
		if(file.exists()) {
			file.delete();
		}
	}

}
