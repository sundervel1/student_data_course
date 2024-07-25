package com.cgi.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.student.dao.StudentDao;
import com.cgi.student.entites.Student;
import com.cgi.student.exception.StudentNotFoundException;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sDao;
	
	@Override
	public Student addStudent(Student student) {
		Student stud1 = sDao.save(student);
		//System.out.println("dao class: " + sDao.getClass().getName());
		//System.out.println("**saved: " + stud1);
		return stud1;
	}
	@Override
    public Student findById(Integer id) {
       Optional<Student> optional = sDao.findById(id);
       if(!optional.isPresent()){
           throw new StudentNotFoundException("student not found for id="+id);
       }
       Student student=optional.get();
       return student;
   }

}
