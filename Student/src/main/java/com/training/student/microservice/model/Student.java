package com.training.student.microservice.model;

import java.util.List;

public class Student {

	private String id;
	private String name;
	private String rollNo;
	private List<Course> course;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Student(String id, String name, String rollNo, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", course=" + course + "]";
	}

}
