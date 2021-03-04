package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		File file =  new File("/Users/sungwookhwang/Documents");

		File[] files = file.listFiles();
		for(File f : files) {
			long time = f.lastModified();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm");
			
			System.out.print(sdf.format(date) + "\t");
			if(f.isDirectory()) {
				System.out.print("<DIR>  : " + f.getName());
			} else {
				System.out.print(f.getName());
			}
			System.out.println();
		}

	}

}
