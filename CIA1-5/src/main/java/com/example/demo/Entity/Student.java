package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Studtent")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //auto increment
    @Column(name="ID")
    private int id; 
    
    @Column(name="StudentName")
    private String StudentName;
    
    @Column(name="DepartmentName")
    private String DepartmentName;

    @Column(name="Section")
    private String Section;
    
    @Column(name="mobile")
    private int mobile;
    
    @Column(name="mailid")
    private String mailid;
    
    @Column(name="address")
    private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	public Student() {
		
	}

	public Student(int id, String studentName, String departmentName, String section, int mobile, String mailid,
			String address) {
		super();
		this.id = id;
		StudentName = studentName;
		DepartmentName = departmentName;
		Section = section;
		this.mobile = mobile;
		this.mailid = mailid;
		this.address = address;
	}
	

}

