package com.Apple.employeeREST.EmployeeRESTproj.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import com.Apple.employeeREST.EmployeeRESTproj.Model.Employee;

@Document
public interface EmployeeDAO extends MongoRepository<Employee, String>{
	
	

}
