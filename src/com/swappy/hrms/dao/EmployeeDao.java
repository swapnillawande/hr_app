package com.swappy.hrms.dao;

import java.util.List;

import com.swappy.hrms.entities.Employee;

public interface EmployeeDao {

	
	  boolean insert(Employee e);
	  void get(int eno);
	  List<Employee> getAll();
	  boolean delete(int eno);
	  boolean update(int eno,Employee e);
	
}
