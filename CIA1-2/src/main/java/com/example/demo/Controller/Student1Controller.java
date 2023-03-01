package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student1;
import com.example.demo.Service.Student1Service;

@RestController
public class Student1Controller {

	@Autowired
	private Student1Service s;
	
	@PostMapping("/add")  
	public Student1 postTeacher(@RequestBody Student1 Tea)
	{
		return s.addTeacher(Tea);
	}
	
	@GetMapping("/show")
	public List<Student1> showTeacher()
	{
		List<Student1> a = new ArrayList<>();
		a = s.getTeacher();
		return a;
	}
	@DeleteMapping("/del/{id}")
	public String delTeacher(@PathVariable("id") int tea_id) {
		s.delById(tea_id);
		return "Susscessfully deleted";
	}

	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student1 obj) {
		s.updateTea(id, obj);
		return "Susscessfully updated";
	}
}
