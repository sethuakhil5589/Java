package demo.launch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LaunchDateAndTimeAPI {

	public static void main(String[] args) {
		
		java.util.Date date=new java.util.Date();
		
		System.out.println(date);
		
		// The above approch is not good, so we got the new joda API which is more accurate and fast
		//So many limations are present in the above type.
		
		System.out.println("*************************");
		LocalDate dateNow= LocalDate.now();
		
		System.out.println(dateNow);
		
		LocalTime timeNow=LocalTime.now();
		System.out.println(timeNow);
		
		System.out.println("******************");
		
		LocalDate splitDate= LocalDate.now();
		
		int day=splitDate.getDayOfMonth();
		
		Month month=splitDate.getMonth();
		
		int year=splitDate.getYear();
		
		System.out.println("Date: "+ day + " /"+ month+ " /"+ year);

	}

}
