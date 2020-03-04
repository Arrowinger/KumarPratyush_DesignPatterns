package com.epam.Design_Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.Design_Pattern.Adapter.Employee;
import com.epam.Design_Pattern.Adapter.EmployeeAdapter;
import com.epam.Design_Pattern.Adapter.Job;
import com.epam.Design_Pattern.CompositePattern.App;
import com.epam.Design_Pattern.FactoryMethodPattern.BrandCheck;
import com.epam.Design_Pattern.FactoryMethodPattern.SmartPhone;
import com.epam.Design_Pattern.ObserverPatternMethod.Youtube;
import com.epam.Design_Pattern.SingletonPattern.SingleTon;
import com.epam.Design_Pattern.StatePattern.StatePattern;



public class Client {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//singleton pattern
		Logger.warn("This is example of Singleton Pattern Method");
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance(); 
		Logger.info("Output of first singleton Object :");
		Logger.warn(st1);
		Logger.info("Output of second singleton Object :");
		Logger.warn(st2);
		if(st1==st2) {
			Logger.info("Both the objects are equal ");
		}
		
		//Factory Pattern Method
		Logger.warn("This is example of Factory Pattern Method");
		BrandCheck bc = new BrandCheck();
		SmartPhone sp = bc.getInstance("1");
		String data1 = sp.brand();
		Logger.info(data1);
		SmartPhone sp1 = bc.getInstance("2");
		String data2 = sp1.brand();
		Logger.info(data2);
		
		//Adapter Pattern Method
		Logger.warn("Example of Adapter Pattern");
		Job j = new Job();
		Employee e = new EmployeeAdapter();
		j.setEmployee(e);
		j.whatJob("I am an employee of EPAM");
		
		//Composite Pattern Method
		Logger.warn("Example of Composite Pattern");
		App ap = new App();
		ap.showData();
		
		//Observer Pattern Method
		Logger.warn("Example of Observer Pattern");
		Youtube yt = new Youtube();
		yt.youTube();
		
		//State Pattern Method
		Logger.warn("Example of State Pattern");
		StatePattern spt = new StatePattern();
		spt.manageState();
	}
 
}
