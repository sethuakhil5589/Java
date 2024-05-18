package com.akhil.configure;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.akhil"})
public class JavaConfiguration {
	
	public JavaConfiguration() {
		System.out.println("Java Configuration was initiated...");
	}
	
	@Bean
	public LocalDateTime createBean() {
		return LocalDateTime.now();
	}

}
