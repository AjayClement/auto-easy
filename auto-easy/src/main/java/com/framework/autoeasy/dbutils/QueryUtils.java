package com.framework.autoeasy.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.framework.autoeasy.propertyreader.PropertyReader;

public class QueryUtils implements DbConnectionFacade{
 
	private PropertyReader objPr;
	private Statement st;
	
	
	
	public void establishDbConnection() throws SQLException {
		    
		objPr = new PropertyReader();
		String url=objPr.readProperty("dbUrl"); 
		   try {
			   
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection(url);
			st=c.createStatement();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}  
		     
		
	}

	public ResultSet executeQuery(String query) throws SQLException {
		
		ResultSet rs=st.executeQuery(query);  
		return rs;
	}


	
	
	
	
	

}
