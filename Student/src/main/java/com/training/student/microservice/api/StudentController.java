package com.training.student.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.student.microservice.model.Course;
import com.training.student.microservice.model.Student;
import com.training.student.microservice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private RestTemplate template;

	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public List<Student> getStudent() {

		return studentService.getStudent();

	}

	@GetMapping("/student/{studentId}")
	public Student getStudentById(@PathVariable String studentId) {

		List<Course> course = template.getForObject("http://course-service/course/" + studentId, List.class);
		Student student = this.studentService.getStudentById(studentId);
		student.setCourse(course);
		return student;

	}

}
