package ch11.exam08;

import java.util.Calendar;
import java.util.Date;

public class Example2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int date = now.get(Calendar.DATE);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year);
		

	}

}
