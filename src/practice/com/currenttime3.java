package practice.com;

import java.time.LocalTime;

public class currenttime3 {

	public static void main(String[] args) {
		
		      LocalTime time = LocalTime.now(); 
		      LocalTime newtime = time.plusHours(6);
		      System.out.println("Time now: " + time + " after 3 hours: " + newtime);
		   
		      add();
		      
		        }
	
	public static void add() {
		int a = 10;
		int b = 10;
		System.out.println(a+b);
	}
		
	}



