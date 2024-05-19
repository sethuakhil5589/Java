package com.akhil.main;

public class EcomExpress implements DeliveryService{

	@Override
	public boolean courierDelivery(double amount) {
		System.out.println("Order was Delivered by EcomExpress, amount: "+amount);
		return true;
	}
}
