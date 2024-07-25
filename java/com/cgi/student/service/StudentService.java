package com.cgi.student.service;

import com.cgi.student.entites.Student;

public interface StudentService {

	Student addStudent(Student student);

	Student findById(Integer id);

}
