package com.epam.Design_Pattern.Adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.Design_Pattern.Client;

public class OtherEmployee {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public void doEmployee(String str) {
		Logger.info(str);
	}
}
