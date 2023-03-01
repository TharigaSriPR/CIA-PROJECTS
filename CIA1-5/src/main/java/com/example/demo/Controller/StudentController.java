package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService s;
	
	@PostMapping("/add")  
	public Student postTeacher(@RequestBody Student Tea)
	{
		return s.addTeacher(Tea);
	}
	
	@GetMapping("/show")
	public List<Student> showTeacher()
	{
		List<Student> a = new ArrayList<>();
		a = s.getTeacher();
		return a;
	}
}
