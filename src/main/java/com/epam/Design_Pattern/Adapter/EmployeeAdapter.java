package com.epam.Design_Pattern.Adapter;

public class EmployeeAdapter implements Employee {

	OtherEmployee oe = new OtherEmployee();
	public void employeeJob(String s) {
		// TODO Auto-generated method stub
		oe.doEmployee(s);
	}

}
