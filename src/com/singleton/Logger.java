package com.singleton;

public class Logger {
	
	public static Logger logger;
	
	public Logger() {
		
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}
