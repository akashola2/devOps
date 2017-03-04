package controller;

import bean.DevOpsBean;

public class DevOpsController {
	DevOpsBean details=new DevOpsBean();
	
	public void set(String name,String company)
	{
		details.setCompany(company);
		details.setName(name);
	}
	
	public void display()
	{
		
		System.out.println(details.getName());
		
		System.out.println(details.getCompany());
	}
}
