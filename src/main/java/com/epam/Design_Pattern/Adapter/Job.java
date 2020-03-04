package com.epam.Design_Pattern.Adapter;

public class Job  {

	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void whatJob(String str) {
		
		employee.employeeJob(str);
	}
}
