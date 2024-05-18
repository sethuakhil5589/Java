package com.akhil.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akhil.beans.Greetme;
import com.akhil.configure.JavaConfiguration;

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Greetme greet=ac.getBean(Greetme.class);
		
		System.out.println(greet.greetings("Akhil"));

	}

}
