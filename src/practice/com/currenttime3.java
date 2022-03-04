package practice.com;

import java.time.LocalTime;

public class currenttime3 {

	public static void main(String[] args) {
		
		      LocalTime time = LocalTime.now(); 
		      LocalTime newtime = time.plusHours(6);
		      System.out.println("Time now: " + time + " after 3 hours: " + newtime);
		        }
		
	}



