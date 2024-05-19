package com.akhil.main;

public class BlueDart implements DeliveryService{

	@Override
	public boolean courierDelivery(double amount) {
		System.out.println("Order was Delivered by BlueDart, amount: "+amount);
		return true;
	}
}
