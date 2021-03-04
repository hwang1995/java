package ch18.exam18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath1 = "/Users/sungwookhwang/Documents/MyProjects/Java/src/ch18/exam18/data.db";
		InputStream is = new FileInputStream(filePath1);
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		dis.close();
		

	}

}
