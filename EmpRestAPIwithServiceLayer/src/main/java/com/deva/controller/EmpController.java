package com.deva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deva.model.Emp;
import com.deva.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/save")
	public String save(@RequestBody Emp employee)
	{
		Emp ee=empService.saveEmployee(employee);
		String message = null;
		if (ee!= null) {
			message = "Employee data saved successfully in DataBase";
		}
		else 
		{
			message = "Employee data not save in Database";
		}
		return message; 
	}
	
	@DeleteMapping("/delete/{eid}")
	public void delete(@PathVariable Integer eid)
	{
		empService.deleteEmployee(eid);
	}
	
	@GetMapping("/get/{eid}")
	public Emp getOne(@PathVariable Integer eid)
	{
		Emp e2=empService.getEmployee(eid);
		return e2;
	}

	@GetMapping("/getAll")
	public List<Emp> getAll() {

		List<Emp> employees=empService.getAllEmployee();
		return employees;

	}

	@PutMapping("/update/{eid}")
	public Emp updateEmployee(@RequestBody Emp employee,
			@PathVariable Integer eid) 
	{
		return empService.updateEmployee(employee, eid);   // save for update record                         
	}
	
}
