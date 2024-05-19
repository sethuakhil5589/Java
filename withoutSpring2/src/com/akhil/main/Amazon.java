package com.akhil.main;

public class Amazon {
	private DeliveryService service;
	
	public Amazon() {
		System.out.println("Constructor invoked");
	}
	
	public void setService(DeliveryService service) {
		this.service = service;
	}

	public boolean deliveryStatus (double amount) {
		
		return service.courierDelivery(amount);
	}

}
