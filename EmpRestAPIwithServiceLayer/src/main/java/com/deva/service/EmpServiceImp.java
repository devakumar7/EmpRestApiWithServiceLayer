package com.deva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deva.model.Emp;
import com.deva.repo.EmpRepo;

	@Service
	public class EmpServiceImp implements EmpService {

		@Autowired
		private EmpRepo empRepo;

		@Override
		public Emp saveEmployee(Emp employee) {
			Emp e1=empRepo.save(employee);
			return e1;
		}

		@Override
		public Emp updateEmployee(Emp employee, Integer eid) {
			Optional<Emp> optional=empRepo.findById(eid);
			Emp employee1=optional.get();
			employee1.setEmpId(eid);
			employee1.setEmpName(employee.getEmpName());
			employee1.setPassword(employee.getPassword());
			employee1.setEmail(employee.getEmail());
			employee1.setGender(employee.getGender());
			employee1.setAddress(employee.getAddress());
			employee1.setSalary(employee.getSalary());
			employee1.setCompanyName(employee.getCompanyName());
			employee1.setDesignation(employee.getDesignation());
			employee1.setState(employee.getState());
			return empRepo.save(employee1); 
		}

		@Override
		public void deleteEmployee(Integer eid) {
			empRepo.deleteById(eid);
		}

		@Override
		public Emp getEmployee(Integer eid) {
			Emp e2=empRepo.findById(eid).get();
			return e2;
		}

		@Override
		public List<Emp> getAllEmployee() {
			List<Emp> employeeList=empRepo.findAll();
			return employeeList;
		}
	}