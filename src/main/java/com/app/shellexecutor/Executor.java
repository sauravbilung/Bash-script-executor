package com.app.shellexecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Executor {

	String [] command;

	private static Logger logger = LoggerFactory.getLogger(Executor.class);

	public void execute() {

		int exitVal = 1;

		logger.info("Executing...");

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
			   logger.info(line);
			}

			exitVal = process.waitFor();

			if (exitVal == 0) {
				logger.info("Succcess");
			} else {
				logger.info("Some error occurred !!! ");
			}

		} catch (IOException e) {

			e.printStackTrace();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public String [] getCommand() {
		return command;
	}

	public void setCommand(String [] command) {
		this.command = command;
	}

}
