package com.akhil.main;

public class FedEx implements DeliveryService{

	@Override
	public boolean courierDelivery(double amount) {
		System.out.println("Order was Delivered by FedEx, amount: "+amount);
		return true;
	}
}
