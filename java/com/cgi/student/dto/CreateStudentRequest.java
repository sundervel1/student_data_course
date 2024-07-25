package com.cgi.student.dto;

import java.util.Set;

import com.cgi.student.entites.Course;

public class CreateStudentRequest {
	private String firstName;
	private String lastName;
	private int age;
	private Set<Course> courses;
	public CreateStudentRequest() {
	}
	public CreateStudentRequest(String firstName, String lastName, int age, Set<Course> courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "CreateStudentRequest [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
