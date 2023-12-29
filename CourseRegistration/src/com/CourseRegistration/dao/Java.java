package com.CourseRegistration.dao;

public class Java implements ICourseRegBase{

	@Override
	public boolean courseRegistration(double amount) {
		System.out.println("Java Course was registered successfully: "+ amount);
		return false;
	}
	
	

}
