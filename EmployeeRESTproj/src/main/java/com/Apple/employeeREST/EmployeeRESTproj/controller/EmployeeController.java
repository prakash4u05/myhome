package com.Apple.employeeREST.EmployeeRESTproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Apple.employeeREST.EmployeeRESTproj.DAO.EmployeeDAO;
import com.Apple.employeeREST.EmployeeRESTproj.Model.Employee;
import com.Apple.employeeREST.EmployeeRESTproj.Service.EmployeeService;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method= RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createEmploye(@RequestBody Employee employee)
	{
		employeeService.createEmploye(employee);
		
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee readEmployee(@PathVariable String id)
	{
		return employeeService.readEmployee(id);
		
		
	}
	
	@RequestMapping(value="/name/{name}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee readEmployeeName(@PathVariable String name)
	{
		return employeeService.readEmployee(name);
		
		
	}
	
	@RequestMapping(method= RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value="/{id}",method= RequestMethod.DELETE)
	public void DeleteEmployee(@PathVariable String id)
	{
		employeeService.DeleteEmployee(id);
	}

}
