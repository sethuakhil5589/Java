package com.akhil.main;

import java.util.Date;

public class GreetingGenarator {
	private Date date;
	
	public GreetingGenarator() {
		System.out.println("Generator class Instantiated...");
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}


	public String greetings(String name) {
		int hours=date.getHours();
		if(hours<12) {
			return("Good Morning "+name);
		}
		else if(hours<16) {
			return("Good Afternoon ");
		}
		else if(hours<20) {
			return("Good Evening ");
		}
		else {
			return("Good Night ");
		}
		
	}


	@Override
	public String toString() {
		return "GreetingGenarator [date=" + date + "]";
	}
	

}
