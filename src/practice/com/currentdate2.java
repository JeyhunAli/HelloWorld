package practice.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentdate2 {

	public static void main(String[] args) {
		
		Date thisDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/Y hh:mm a");
		System.out.println(date.format(thisDate));
		

	}

}
