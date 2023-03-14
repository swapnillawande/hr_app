package com.swappy.hrms.dao;

import java.util.List;
import java.util.Scanner;
import java.sql.*;

import com.swappy.hrms.entities.Employee;
import com.swappy.hrms.util.*;

public class JdbcEmployeeDaoImpl implements EmployeeDao{

	public static String driver ="oracle.jdbc.driver.OracleDriver";
    public  static String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
    public static String user="system" , password ="root";
    public static Scanner sc = new Scanner(System.in);
    
    public int empNo;
    public String empName="";
    public String empAddress="";
    
    
	@Override
	public boolean insert(Employee e) {
		// TODO Auto-generated method stub
		
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con = ConnectionFactory.getConnection(driver, dbUrl,user, password);
			if(con!=null) {
				
				System.out.println("Enter employee id = ");
				empNo = sc.nextInt();
				System.out.println("Enter employee name = ");
				empName = sc.next();
				System.out.println("Enter employee address = ");
				empAddress = sc.next();
				pst = con.prepareStatement("insert into emp values(?,?,?)");
				
				
				pst.setInt(empNo, 1);
				pst.setString(2,empName);
				
				
				
			}
			
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
