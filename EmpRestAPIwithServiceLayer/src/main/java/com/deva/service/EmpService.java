package com.deva.service;

import java.util.List;

import com.deva.model.Emp;

public interface EmpService {
	
	public Emp saveEmployee(Emp employee);
	public Emp updateEmployee(Emp employee,Integer eid);
	public void deleteEmployee(Integer eid);
	public Emp getEmployee(Integer eid);
	public List<Emp> getAllEmployee();
}
