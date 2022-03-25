package com.unext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unext.model.Employee;
import com.unext.repository.EmployeeRepository;
import com.unext.repository.EmployeeRepositoryImpl;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository<Employee> employeeRepository;

	
	
	@Transactional
	public List<Employee> getAllEmployees() {
		if (employeeRepository==null)
			System.out.println("Yes null");
		return (List<Employee>) employeeRepository.findAll();
	}

	@Transactional
	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
	}

	@Transactional
	public Employee getByEno(int eno) {
		return employeeRepository.findOne(eno);
	}

	@Transactional
	public void deleteEmployee(int eno) {
		employeeRepository.delete(eno);
	}

	@Transactional
	public boolean addEmployee(Employee employee) {
		return employeeRepository.save(employee) != null;
	}

	@Transactional
	public boolean updateEmployee(Employee employee) {
		return employeeRepository.save(employee) != null;
	}

}
