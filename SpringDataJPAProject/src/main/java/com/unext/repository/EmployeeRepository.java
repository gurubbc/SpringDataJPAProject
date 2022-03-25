package com.unext.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.unext.model.Employee;

public interface EmployeeRepository<E> extends CrudRepository<Employee, Integer>{
	List<Employee> findByName(String name);

	
	
}
