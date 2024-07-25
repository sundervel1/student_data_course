package com.cgi.student.dto;

import java.util.Set;

import com.cgi.student.entites.Course;

public class StudentDetails {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private Set<CourseDetails> courses;
	public StudentDetails() {
	}
	public StudentDetails(int id, String firstName, String lastName, int age, Set<CourseDetails> courses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", courses=" + courses + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Set<CourseDetails> getCourses() {
		return courses;
	}
	public void setCourses(Set<CourseDetails> courses) {
		this.courses = courses;
	}


}
