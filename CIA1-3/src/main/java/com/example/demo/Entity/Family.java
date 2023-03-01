package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Family")
public class Family {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //auto increment
    @Column(name="ID")
    private int id; 
    
    @Column(name="Name")
    private String Name;
    
   
    @Column(name="age")
    private int age;
    
    @Column(name="relation")
    private String relation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Family(int id, String name, int age, String relation) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.relation = relation;
	}
	
}
