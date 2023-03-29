package com.cipherman.jdbc.root;

import java.lang.Double;
import java.lang.Integer;
import com.cipherman.jdbc.root.util.DataTransferObject;
public class Employee implements DataTransferObject {
		@Override
	public String toString() {
		return "Employee [ssn=" + ssn + ", fname=" + fname + ", lname=" + lname + ", minit=" + minit + ", bdate="
				+ bdate + ", address=" + address + ", sex=" + sex + ", salary=" + salary + ", super_ssn=" + super_ssn
				+ ", dno=" + dno + "]";
	}
		private String ssn;
		private String fname;
		private String lname;
		private String minit;
		private String bdate;
		private String address;
		private String sex;
		private Double salary;
		private String super_ssn;
		private Integer dno;
		
		
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getMinit() {
			return minit;
		}
		public void setMinit(String minit) {
			this.minit = minit;
		}
		public String getBdate() {
			return bdate;
		}
		public void setBdate(String bdate) {
			this.bdate = bdate;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		public String getSuper_ssn() {
			return super_ssn;
		}
		public void setSuper_ssn(String super_ssn) {
			this.super_ssn = super_ssn;
		}
		public Integer getDno() {
			return dno;
		}
		public void setDno(Integer dno) {
			this.dno = dno;
		}
		@Override
		public String getId() {
			return ssn;
		}
		
		
		
}
