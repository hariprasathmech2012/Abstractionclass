package com.multipleinheritance;

public class CompanyOwner implements Employee , CompanyManager {


	public void companyManagerName() {
		System.out.println("company manager name is hari");
		
	}

	
	public void empName() {
		System.out.println("employee name is arun");
		
	}
	
	public static void main(String[] args) {
		CompanyOwner c = new CompanyOwner();
		c.empName();
		c.companyManagerName();
	}

}
