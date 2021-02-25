package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) {
		try {
			method("/Users/sungwookhwang/Desktop/0223.pdf");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
	
	public static void method(String filePath) throws FileNotFoundException {
//			FileInputStream fis = new FileInputStream("/Users/sungwookhwang/Desktop/0223.pdf");
			FileInputStream fis = new FileInputStream(filePath);
		
	}

}
