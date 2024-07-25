package com.cgi.student.util;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cgi.student.dto.CourseDetails;
import com.cgi.student.dto.StudentDetails;
import com.cgi.student.entites.Course;
import com.cgi.student.entites.Student;

@Component
public class StudentUtil {

	public StudentDetails toDetails(Student student) {
		Set<Course> courses = student.getCourses();
		Set<CourseDetails> details = new HashSet<>();
		for (Course course : courses) {
			details.add(new CourseDetails(course));
		}
		return new StudentDetails(student.getId(), student.getFirstName(), 
				student.getLastName(), student.getAge(), details);
	}

}
