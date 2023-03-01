package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Family;
import com.example.demo.Service.FamilyService;

@RestController
public class FamilyController {

	@Autowired
	private FamilyService s;
	
	@PostMapping("/addfam")  
	public Family postTeacher(@RequestBody Family Tea)
	{
		return s.addFam(Tea);
	}
	
	@GetMapping("/showfam")
	public List<Family> showTeacher()
	{
		List<Family> a = new ArrayList<>();
		a = s.getFam();
		return a;
	}
	
}
