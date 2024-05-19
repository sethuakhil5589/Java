package com.akhil.main;

import java.util.Date;

public class LaunchApp {

	public static void main(String[] args) {
		
		GreetingGenarator gt=new GreetingGenarator();
		
		gt.setDate(new Date());
		System.out.println("Date obj created");
		
		String greetings=gt.greetings("Akhil");
		System.out.println("Greetings method called");
		System.out.println(gt);
		
		System.out.println(greetings);

	}

}
