package com.akhil.main;

public class LaunchApp {

	public static void main(String[] args) {
		Amazon a=new Amazon();
		
		
		
		a.setService(new EcomExpress());
		
		a.deliveryStatus(500);

	}

}
