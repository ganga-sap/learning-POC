package com.rubix.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.employeemanagement.domain.Employee;

public interface Employeerepository extends CrudRepository<Employee,Long>{

}
