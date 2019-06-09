package com.framework.autoeasy.dbutils;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DbConnectionFacade {
	
	
	public void establishDbConnection() throws SQLException;
	
	public ResultSet executeQuery(String query) throws SQLException;	
	

}
