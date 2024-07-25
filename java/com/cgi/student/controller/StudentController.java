package com.cgi.student.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.student.dto.CreateStudentRequest;
import com.cgi.student.dto.StudentDetails;
import com.cgi.student.entites.Course;
import com.cgi.student.entites.Student;
import com.cgi.student.service.StudentService;
import com.cgi.student.util.StudentUtil;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studService;
	@Autowired
	private StudentUtil studUtil;
	
	@PostMapping("/add")
	public StudentDetails add(@RequestBody CreateStudentRequest requestData) {
		System.out.println("requestData: " + requestData);
		Student student = new Student(requestData.getFirstName(), requestData.getLastName(), 
						requestData.getAge());
		Set<Course> courseSet = requestData.getCourses();
		if(courseSet != null) {
			for (Course course : courseSet) {
				student.addCourse(course);
			}
		}
		System.out.println("stud came: " + student);
		Student savedStudent = studService.addStudent(student);
		StudentDetails studDetails = studUtil.toDetails(savedStudent);
		return studDetails;
	}

	   @GetMapping("/by/id/{id}")
	   public StudentDetails fetchStudent(@PathVariable("id") Integer id) {
	      Student student = studService.findById(id);
	      StudentDetails details = studUtil.toDetails(student);
	      return details;
	   }
}
