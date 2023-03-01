package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo r;
	
	public Student addTeacher(Student obj)
	{
		return r.save(obj);
	}
	
	public List<Student> getTeacher()
	{
		List<Student> arr=new ArrayList<>();
		arr=r.findAll();
		return arr;
	}

}
