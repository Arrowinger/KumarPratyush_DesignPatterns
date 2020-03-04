package com.epam.Design_Pattern.CompositePattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.Design_Pattern.Client;

public class Leaf implements Component{

	private static Logger Logger = LogManager.getLogger(Client.class);
	int price;
	String name;
	public void showPrice() {
		// TODO Auto-generated method stub
		Logger.info(name + ":" + price);
		//Logger.info(price);
	}
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}
