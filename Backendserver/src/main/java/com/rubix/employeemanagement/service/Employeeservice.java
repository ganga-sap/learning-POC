package com.rubix.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.employeemanagement.domain.Employee;
import com.rubix.employeemanagement.repository.Employeerepository;

@Service
public class Employeeservice {
	@Autowired
	public Employeerepository empRepo;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		empRepo.findAll().forEach(employees::add);
		return employees;

	}

	public String addEmployee(Employee employee) {

		empRepo.save(employee);
		return "Employee added successfully";
	}

	
	  public void updateEmployee(Employee employee) {
	  
	  empRepo.save(employee); }
	 

	public void deleteEmployee(long id) {

		empRepo.deleteById(id);
	}

	public String getEmployeeById(long id) {
		 
		 empRepo.findById(id);
		 return "";
		
		 
	}

}
