package ch18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {

		// 방법 1
		/*		InputStream is = System.in;
		
				byte[] arr = new byte[100];
				
				int readNum = is.read(arr);
				String str = new String(arr,0, readNum -1 );
				System.out.println(str);
				
				readNum = is.read(arr);
				str = new String(arr,0, readNum -1 );
				System.out.println(str);*/
		
		// 방법 2 - 보조 스트림을 사용한다.
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		System.out.println(str);
		str = br.readLine();
		System.out.println(str);
		
		
		
	}

}
