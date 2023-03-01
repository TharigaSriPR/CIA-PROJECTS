package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="EmployeeName")
	private String EmployeeName;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="pincode")
	private int pincode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Employee() {
		
	}

	public Employee(int id, String employeeName, String address, int pincode) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		Address = address;
		this.pincode = pincode;
	}
	
	
	
}
