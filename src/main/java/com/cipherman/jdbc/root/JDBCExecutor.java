package com.cipherman.jdbc.root;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.List;

public class JDBCExecutor {
	
	public static void main(String args[]) {
		DatabaseConectionManager dcm = new DatabaseConectionManager("localhost:5432","jdbc_learning","postgres","Iamrishav@0804");
		
		try {
			Connection connection = dcm.getConnection();
			EmployeeDAO empDAO = new EmployeeDAO(connection);
			//create(empDAO);	
			//read(empDAO);
			//update(empDAO);
			//delete(empDAO);
			getAll(empDAO);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		/*try {
			
			Connection connection = dcm.getConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM EMPLoYEE");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(3));
				System.out.println("*******");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}*/
		
		
	}
	public static void create(EmployeeDAO empDAO) throws SQLException{
		
		Employee emp = new Employee();
		emp.setFname("RISHAV");
		emp.setMinit(null);
		emp.setLname("RAJ");
		emp.setAddress("NEW DELHI");
		emp.setBdate("2003-04-08");
		emp.setDno(3);
		emp.setSalary(100000.00);
		emp.setSex("M");
		emp.setSsn("1233679");
		emp.setSuper_ssn("123456789");
		
		empDAO.create(emp);
		System.out.println("INSERTED SUCCESSFULLY");
	}
	
	public static void read(EmployeeDAO empDAO) throws SQLException{
		Employee emp = empDAO.findbyID("123456789");
		System.out.println(emp.toString());
	}
	
	public static void update(EmployeeDAO empDAO) throws SQLException{
		Employee emp = empDAO.findbyID("123456789");
		emp.setFname("Jack");
		emp.setSalary(300000.0);
		emp = empDAO.update(emp);
		System.out.println(emp.toString());
		
	}
	public static void delete(EmployeeDAO empDAO) {
		Employee emp = empDAO.findbyID("1233679");
		System.out.println(emp);
		empDAO.delete(emp.getSsn());
	}
	
	public static void getAll(EmployeeDAO empDAO) {
		List<Employee> emps = empDAO.findAll();
		for(int i=0;i<emps.size();i++) {
			System.out.println(emps.get(i));
		}
	}
}
