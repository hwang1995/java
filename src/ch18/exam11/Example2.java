package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args){
		
		
		try {
			while(true) {
				int keyCode = System.in.read();
				System.out.println(keyCode);
//				System.out.println();
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
