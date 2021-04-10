package com.rubix.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rubix.employeemanagement.domain.Employee;
import com.rubix.employeemanagement.service.Employeeservice;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	public Employeeservice empService;

	@GetMapping("/list")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {

		return empService.addEmployee(employee);
	}
	/* @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	public String findEmployeeById(@PathVariable long id) {
		 return empService.getEmployeeById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {

		empService.updateEmployee(employee);
	} */

	@DeleteMapping( "/delete/{id}")
	public void deleteEmployee(@PathVariable long id) {

		empService.deleteEmployee(id);

	}
}
