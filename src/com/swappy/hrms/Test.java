package com.swappy.hrms;

import java.util.List;

import com.swappy.hrms.dao.EmployeeDao;
import com.swappy.hrms.dao.JdbcEmployeeDaoImpl;
import com.swappy.hrms.entities.Employee;

public class Test {

	public static void main(String[] args) {
		 
		EmployeeDao dao = new JdbcEmployeeDaoImpl();
//		if(dao.insert(new Employee(2,"Swappy","Mumbai"))) {
//			 
//		}else {
//			System.out.println("404");
//		}
		
//		List<Employee> lst = dao.getAll();
//		for(Employee e : lst) {
//			System.out.println(e.getName());
//		}

		dao.delete(2);
		
	}

}
