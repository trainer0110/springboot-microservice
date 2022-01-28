package com.training.student.microservice.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.training.student.microservice.model.Student;

@Component
public class StudentDao {

	List<Student> studentList = List.of(new Student("1", "Raohit", "2222", null),
			new Student("2", "Virat", "2222", null), new Student("3", "Sachin", "2222", null),
			new Student("4", "Vijay", "2222", null));

	public List<Student> getStudent() {
		return studentList;
	}

	public Student getStudentById(String id) {
		return this.studentList.stream().filter(st -> st.getId().equalsIgnoreCase(id)).findAny().orElse(null);
	}
}
