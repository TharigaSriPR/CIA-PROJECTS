package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService s;
	
	
	@GetMapping("/s/{id}")
	public Optional<Employee> showDetailsId(@PathVariable int id){
		return s.getAddress(id);
		
	}
	
	
	@PostMapping("/add1")
	public Employee postBook(@RequestBody Employee bk) {
		return s.saveDetails(bk);
	}
	
	
	
}
