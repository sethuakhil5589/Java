package com.telusko.dao;

public class CreditCard implements ChoosePaymentMethod{

//	public CreditCard() {
//		System.out.println("Credit card Initiated");
//	}
	@Override
	public boolean choosingMethod(double amount) {
		System.out.println("Credit Card Initiated");
		System.out.println("Payment successfull with amount: "+ amount);
		return true;
	}

}
