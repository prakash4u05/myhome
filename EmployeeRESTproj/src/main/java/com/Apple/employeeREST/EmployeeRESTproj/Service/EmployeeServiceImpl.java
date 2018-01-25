package com.Apple.employeeREST.EmployeeRESTproj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apple.employeeREST.EmployeeRESTproj.DAO.EmployeeDAO;
import com.Apple.employeeREST.EmployeeRESTproj.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public void createEmploye(Employee employee) {
		employeeDAO.save(employee);
		
	}

	@Override
	public Employee readEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeDAO.findOne(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
		
		
	}

	@Override
	public void DeleteEmployee(String id) {
		employeeDAO.delete(id);
		
	}

	@Override
	public Employee readEmployeeName(String name) {
		return employeeDAO.findOne(name);
	}

}
