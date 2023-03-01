package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Family;
import com.example.demo.Repository.FamilyRepo;

@Service
public class FamilyService {

	@Autowired
	private FamilyRepo r;
	
	public Family addFam(Family obj)
	{
		return r.save(obj);
	}
	
	public List<Family> getFam()
	{
		List<Family> arr=new ArrayList<>();
		arr=r.findAll();
		return arr;
	
	}
}
