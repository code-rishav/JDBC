package com.cipherman.jdbc.root.util;

import java.sql.Connection;
import java.util.List;

public abstract class DataAccessObject <T extends DataTransferObject>  {
	protected Connection connection;
	public DataAccessObject(Connection connection) {
		super();
		this.connection = connection;
		
	}
	public abstract T findbyID(String id);
	public abstract List<T> findAll();
	public abstract T update(T dto);
	public abstract T create(T dto);
	public abstract void delete(String id);
	
}
