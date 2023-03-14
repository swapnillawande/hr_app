package com.swappy.hrms.dao;

import java.util.List;
import java.sql.*;

import com.swappy.hrms.entities.Employee;
import com.swappy.hrms.util.*;

public class JdbcEmployeeDaoImpl implements EmployeeDao{

	public static String driver ="oracle.jdbc.driver.OracleDriver";
	@Override
	public boolean insert(Employee e) {
		// TODO Auto-generated method stub
		
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con = ConnectionFactory.getConnection(null, null, null, null);
			
		}catch(Exception e1) {
			
		}
		
		
		return false;
	}

	@Override
	public void get(int eno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int eno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int eno, Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
