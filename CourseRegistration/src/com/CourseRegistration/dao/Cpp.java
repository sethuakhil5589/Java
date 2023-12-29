package com.CourseRegistration.dao;

public class Cpp implements ICourseRegBase {

	@Override
	public boolean courseRegistration(double amount) {
		System.out.println("Cpp Course was registered successfully: "+ amount);
		
		return false;
	}

}
