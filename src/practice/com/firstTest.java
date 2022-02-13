package practice.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class firstTest {

	public static void main(String[] args) {
	
		//this method is adding 2 day to current day

	      Calendar cal = Calendar.getInstance();
		  cal.add(Calendar.DATE, 2); 
		  String date =  new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		  System.out.println(date);
		  
	}

}
