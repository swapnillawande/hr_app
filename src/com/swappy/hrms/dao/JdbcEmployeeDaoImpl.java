package com.swappy.hrms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

import com.swappy.hrms.entities.Employee;
import com.swappy.hrms.util.*;

public class JdbcEmployeeDaoImpl implements EmployeeDao{


    public static Scanner sc = new Scanner(System.in);
 
 
	@Override
	public boolean insert(Employee e) {
		// TODO Auto-generated method stub
		
		Connection con =null;
		PreparedStatement pst=null;
		boolean isInserted = false;
		
		try {
			con = ConnectionFactory.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			if(con!=null) {
 
				pst = con.prepareStatement("insert into emp values(?,?,?)");
 
				pst.setInt(1, e.getEno());
				pst.setString(2,e.getName());
				pst.setString(3,e.getAddress());
				int i = pst.executeUpdate();
				if(i>0) {
					isInserted = true;
					System.out.println("Employee "+e.getName()+" inserted ");
				}
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return isInserted;
	}

	@Override
	public Employee get(int eno) {
		Connection con =null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		Employee e = null;

		try {
			con = ConnectionFactory.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			if(con!=null) {
 
				pst = con.prepareStatement("select * from emp where eno=?");
				rs = pst.executeQuery();
				rs.next();
				
				e = new Employee(rs.getInt("emp_no"),rs.getString("emp_name"),rs.getString("emp_address"));
				return e;
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public List<Employee> getAll() {
		
		Connection con =null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		Employee e = null;
		List<Employee> lst = new ArrayList<>();

		try {
			con = ConnectionFactory.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			if(con!=null) {
				
				pst = con.prepareStatement("select * from emp ");
				rs = pst.executeQuery();
				
				while(rs.next()) {
					e = new Employee(rs.getInt("emp_no"),rs.getString("emp_name"),rs.getString("emp_address"));
					lst.add(e);
				}
				
			}
			return lst;
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public boolean delete(int eno) {
		Connection con =null;
		PreparedStatement pst=null;
		boolean isDeleted = false;
		
		try {
			con = ConnectionFactory.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			if(con!=null) {
 
				pst = con.prepareStatement("delete from emp where emp_no=?");
				pst.setInt(1, eno);
				int i = pst.executeUpdate();
				if(i>0) {
					System.out.println("Employee with employee_id : "+eno+" deleted");
				}else {
					System.out.println("404");
				}
				
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return isDeleted;

	}

	@Override
	public boolean update(int eno, Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
