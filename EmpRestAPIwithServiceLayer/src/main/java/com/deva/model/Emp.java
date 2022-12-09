package com.deva.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="emp1")
public class Emp {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="eName")
	private String empName;
	@Column(name="pwd")
	private String password;
	private String email;
	private String gender;
	private String address;
	private String salary;
	private String companyName;
	private String designation;
	private String state;
	
	//PDC+PPC+PSM+PGM+toString()
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer empId, String empName, String password, String email, String gender, String address,
			String salary, String companyName, String designation, String state) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
		this.companyName = companyName;
		this.designation = designation;
		this.state = state;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", password=" + password + ", email=" + email
				+ ", gender=" + gender + ", address=" + address + ", salary=" + salary + ", companyName=" + companyName
				+ ", designation=" + designation + ", state=" + state + "]";
	}
	
}
