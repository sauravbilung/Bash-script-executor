package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.app.shellexecutor.Executor;


public class BashExecutor {
	
	private static Logger logger = LoggerFactory.getLogger(BashExecutor.class);
	
	public static void main(String[] args) {		
		
		String [] command1 = {"sh",args[0]};
		
		Executor executor=new Executor();
	
		logger.info("Beginning Execution !!!");
		executor.setCommand(command1);		
		executor.execute();
		
		logger.info("Execution Ended !!!");
	}
}

