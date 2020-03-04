package com.epam.Design_Pattern.SingletonPattern;



public class SingleTon {

	static SingleTon obj = new SingleTon();
	private SingleTon() {}
	public static SingleTon getInstance() {
		return obj;
	}
}
