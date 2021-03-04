package ch11.exam02;

import java.util.Calendar;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		Date var2 = new Date();
		System.out.println(var2.toString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4);
		
		String result = var4 + " => spring : 봄들이";
		System.out.println(result);
		
		System.out.println(System.currentTimeMillis());
		

	}

}
