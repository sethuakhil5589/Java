package com.CourseRegistration.dao;

public class Sql implements ICourseRegBase {

	@Override
	public boolean courseRegistration(double amount) {
		System.out.println("Sql Course was registered successfully: "+ amount);
		return false;
	}

}
