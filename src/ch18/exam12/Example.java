package ch18.exam12;

import java.io.IOException;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		os.write(new byte[] {65,66,67,68,69,70, 10});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		os.write(new byte[] {65});
		

	}

}
