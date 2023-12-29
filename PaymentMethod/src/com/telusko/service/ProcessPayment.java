package com.telusko.service;



import java.util.Scanner;

import com.telusko.dao.ChoosePaymentMethod;
import com.telusko.dao.CreditCard;
import com.telusko.dao.DebitCard;
import com.telusko.dao.QRCode;




public class ProcessPayment {
	
	public ProcessPayment() {
		System.out.println("In process Payment");
	}
	private ChoosePaymentMethod choosePayMethod;

	public void setChoosePayMethod(ChoosePaymentMethod choosePayMethod) {
		this.choosePayMethod = choosePayMethod;
	}
	
	Scanner scan= new Scanner(System.in);
	
	public boolean paymentProcessing(double amount) {
		System.out.println("Welcome to Gas Station");
		System.out.println("Select payment method");
		System.out.println("Option 1: Credit Card   Option 2: Debit Card   Option 3: QR code");
		
		
		int option= scan.nextInt();
		
		
		if (option==1) {
			setChoosePayMethod(new CreditCard());// CreditCard card= new CreditCard();
		}
		else if (option==2){
			setChoosePayMethod(new DebitCard());
		}
		else if(option ==3) {
			setChoosePayMethod(new QRCode());
		}
		else {
			System.out.println("Choose the correct option");
		}
		choosePayMethod.choosingMethod(amount);
		return true;
	}



	
	
	

}
