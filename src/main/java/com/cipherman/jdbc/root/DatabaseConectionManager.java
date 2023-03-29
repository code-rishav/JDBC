package com.cipherman.jdbc.root;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;

public class DatabaseConectionManager {
	private final String url;
	private final Properties properties;
	
	public DatabaseConectionManager(String host, String dbname,String user, String pwd) {
		this.url = "jdbc:postgresql://"+host+"/"+dbname;
		this.properties = new Properties();
		this.properties.setProperty(user,pwd);
		
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,properties);
	}
}
