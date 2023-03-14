package com.swappy.hrms.util;

import java.sql.Connection;
import java.sql.*;

public class ConnectionFactory {

	
	public static Connection getConnection(String driver,String url,String userName,String password) {
		
		Connection con =null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,userName,password);
			if(con!=null) {
				return con;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
}
