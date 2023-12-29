package com.telusko.main;

import com.telusko.service.ProcessPayment;

public class LaunchMain {

	public static void main(String[] args) {
		
		ProcessPayment pp=new ProcessPayment();
		
		pp.paymentProcessing(500);
		
		
	}

}
