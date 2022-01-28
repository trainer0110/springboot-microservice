package com.training.course.microservice.model;

public class Course {

	private int courseId;
	private String courseName;
	private String courseType;
	private int studentId;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Course(int courseId, String courseName, String courseType, int studentId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", studentId=" + studentId + "]";
	}

}
