package com.examples.empapp.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.empapp.model.Employee_details;
import com.examples.empapp.service.Employee_Service;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	Employee_Service empService;
	
	//	GET		/employees			=> List All Employees	
	@GetMapping
	public List<Employee_details> getAllEmployees() {
		
		return Employee_Service.displayEmployee();
	}
	
//	GET 	/employees/{id}		=> List employee for given Id
//	POST	/employees			=> Create Employee
//	PUT		/employees/{id}		=> Update Employee
//	DELETE	/employees/{id}		=> Delete Employee
	
}
