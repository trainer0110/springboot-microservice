package com.training.course.microservice.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.training.course.microservice.model.Course;

@Component
public class CourseDao {

	List<Course> courseList = List.of(new Course(1, "IT", "Permanent", 1), new Course(2, "Art", "Permanent", 1),
			new Course(3, "Bcom", "Correspondence", 2), new Course(4, "MBA", "Correspondence", 2));

	public List<Course> getCourse() {
		return courseList;
	}

	public List<Course> getCourseByStudentId(int studentId) {
		return this.courseList.stream().filter(course -> course.getStudentId() == studentId)
				.collect(Collectors.toList());
	}
}
