package com.CourseRegistration.Service;

import com.CourseRegistration.dao.ICourseRegBase;
import com.CourseRegistration.dao.Java;
import com.CourseRegistration.dao.Sql;

public class RegistrationProcess {
	ICourseRegBase regBase;
	
	

//	public void setRegBase(ICourseRegBase regBase) {
//		this.regBase = regBase;
//	}
	
	public RegistrationProcess(ICourseRegBase regBase) {
		super();
		this.regBase = regBase;
	}



//	public RegistrationProcess() {
//		super();
//	}



	public boolean registration(double amount) {
		
//		RegistrationProcess(new Sql());
//		RegistrationProcess(new Java());
		regBase.courseRegistration(amount);
		return true;
	}

}
