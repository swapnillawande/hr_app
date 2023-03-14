package com.swappy.hrms.entities;

public class Employee {

	private int eno;
	private String name;
	private String address;
	
	
	
	public Employee() {
		
	}

	public Employee(int eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
	}
	

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
