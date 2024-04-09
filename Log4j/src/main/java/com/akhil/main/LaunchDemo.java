package com.akhil.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LaunchDemo {
	private static final Logger logger=LogManager.getLogger(LaunchDemo.class);
	public static void main(String[] args) {
		loggingMethods();

	}
	public static void loggingMethods() {
		logger.trace("In Trace Method");
		
		logger.info("In Info Method");
		logger.debug("In Debug Method");
		
		logger.warn("In Warn Method");
		logger.error("In Error Method");
		logger.fatal("In Fatal Method");
	}

}
