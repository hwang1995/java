package ch18.exam15;

import java.io.File;
import java.util.Arrays;

public class Example1 {

	private static File file;

	public static void main(String[] args) {
		file = new File("/Users/sungwookhwang/Documents");
		if(file.isDirectory()) {
			System.out.println("디렉토리 입니다.");
			String[] data = file.list();
			System.out.println(Arrays.toString(data));
		} else {
			System.out.println("파일입니다.");
		}
		file = new File("/Users/sungwookhwang/Documents/index.html");
		if(file.isFile()) {
			long size = file.length();
			System.out.println(size + " bytes");
		}


	}

}
