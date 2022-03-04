package practice.com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class currenttime {

	public static void main(String[] args) {
		
		
		String date = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		cal.add(Calendar.HOUR,+5);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		

		
		Date date1 = new Date(System.currentTimeMillis());
		System.out.println(date1);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

}
