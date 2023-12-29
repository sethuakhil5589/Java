package com.telusko.dao;

public class DebitCard implements ChoosePaymentMethod{

	public DebitCard() {
		System.out.println("Debit card Initiated");
	}
	
	@Override
	public boolean choosingMethod(double amount) {
		System.out.println("Debit Card Initiated");
		System.out.println("Payment successfull with amount: "+ amount);
		return true;
	}

}
