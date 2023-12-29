package com.CourseRegistration.main;

import com.CourseRegistration.Service.RegistrationProcess;
import com.CourseRegistration.dao.Java;

public class LaunchCourseRegistration {

	public static void main(String[] args) {
		RegistrationProcess reg= new RegistrationProcess(new Java());
		reg.registration(650.50);

	}

}
