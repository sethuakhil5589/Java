package com.akhil.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Greetme {
	@Autowired
	private LocalDateTime dateTime;
	
	
	public String greetings(String name) {
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Morning "+name;
		else if(hour<16)
			return "Good Afternoon "+name;
		else if(hour<20)
			return "Good Evening "+name;
		else
			return "Good Night "+name; 
	}

}
