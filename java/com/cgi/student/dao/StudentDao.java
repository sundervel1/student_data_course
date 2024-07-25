package com.cgi.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.student.entites.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
