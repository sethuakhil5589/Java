package com.telusko.dao;

public class QRCode implements ChoosePaymentMethod {
	
	public QRCode() {
		System.out.println("QR code Initiated");
	}

	@Override
	public boolean choosingMethod(double amount) {
		System.out.println("QR Code Initiated");
		System.out.println("Payment successfull with amount: "+ amount);
		return true;
	}

}
