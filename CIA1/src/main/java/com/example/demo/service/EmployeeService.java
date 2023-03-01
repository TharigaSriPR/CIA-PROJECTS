package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo r;
	
	public Optional<Employee> getAddress(int id) {
		Optional<Employee> b=r.findById(id);
		return b;
	}
	public Employee saveDetails(Employee bk) {
		return r.save(bk);
	}
}
