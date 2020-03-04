package com.epam.Design_Pattern.FactoryMethodPattern;

public class BrandCheck {

	public SmartPhone getInstance(String s) {
		if(s.equals("1")) {
			return (SmartPhone) new Samsung();
		}
		else if(s.equals("2")) {
			return (SmartPhone) new MI();
		}
		else {
			return (SmartPhone) new Oppo();
		}
	}
}
