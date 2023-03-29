package com.cipherman.jdbc.root;

import java.util.List;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.cipherman.jdbc.root.util.DataAccessObject;
public class EmployeeDAO extends DataAccessObject<Employee> {
	private static final String INSERT = "INSERT INTO EMPLOYEE(fname,minit,lname,ssn,bdate,address,sex,salary,super_ssn,dno) VALUES (?,?,?,?,?,?,?,?,?,?)";
	
	private static final String GET = "SELECT * FROM EMPLOYEE where ssn=?";
	
	public EmployeeDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public Employee findbyID(String ID) {
		Employee emp = new Employee();
		try(PreparedStatement st = this.connection.prepareStatement(GET);){
			st.setString(1,ID);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				emp.setFname(rs.getString(1));
				emp.setMinit(rs.getString(2));
				emp.setLname(rs.getString(3));
				emp.setSsn(rs.getString(4));
				emp.setBdate(rs.getDate(5).toString());
				emp.setAddress(rs.getString(6));
				emp.setSex(rs.getString(7));
				emp.setSalary(rs.getDouble(8));
				emp.setSuper_ssn(rs.getString(9));
				emp.setDno(rs.getInt(10));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
	
		return null;
	}

	@Override
	public Employee update(Employee dto) {

		return null;
	}

	@Override
	public Employee create(Employee dto) {
		try(PreparedStatement st = this.connection.prepareStatement(INSERT);){
			st.setString(1,dto.getFname());
			st.setString(2, dto.getMinit());
			st.setString(3,dto.getLname());
			st.setString(4,dto.getSsn());
			st.setDate(5, Date.valueOf(dto.getBdate()));
			st.setString(6, dto.getAddress());
			st.setString(7, dto.getSex());
			st.setDouble(8,dto.getSalary());
			st.setString(9,dto.getSuper_ssn());
			st.setInt(10,dto.getDno());
			st.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(String id) {
		
	}
}
