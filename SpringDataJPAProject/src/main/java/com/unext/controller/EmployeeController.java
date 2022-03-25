package com.unext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unext.model.Employee;
import com.unext.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
//	EmployeeService employeeService;
	
	public EmployeeController() {
		System.out.println("Employee Controller");
//		employeeService=new EmployeeService();
	}

	@RequestMapping(value = "/employee/{eno}", method = RequestMethod.GET)
	public @ResponseBody Employee getAllemployees(@PathVariable Integer eno) {
		return employeeService.getByEno(eno);
	}

	@RequestMapping(value = "/employeeByName/{name}", method = RequestMethod.GET)
	public List<Employee> getemployeeByName(@PathVariable String name) {
		return employeeService.findByName(name);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getAll() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/employee/{eno}", method = RequestMethod.DELETE)
	public HttpStatus deleteEmployee(@PathVariable Integer eno) {
		employeeService.deleteEmployee(eno);
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public HttpStatus insertEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public HttpStatus updatePerson(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}


}
