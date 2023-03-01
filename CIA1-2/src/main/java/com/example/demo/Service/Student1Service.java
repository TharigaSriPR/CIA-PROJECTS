package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student1;
import com.example.demo.Repository.StudentRepoo;

@Service
public class Student1Service {

	@Autowired
	private StudentRepoo r;
	
	public Student1 addTeacher(Student1 obj)
	{
		return r.save(obj);
	}
	
	public List<Student1> getTeacher()
	{
		List<Student1> arr=new ArrayList<>();
		arr=r.findAll();
		return arr;
	}
	public void delById(int tea_id) {
		r.deleteById(tea_id);
		
	}

public Student1 updateTea(int id, Student1 obj) {
		return r.saveAndFlush(obj);
}
    
}
