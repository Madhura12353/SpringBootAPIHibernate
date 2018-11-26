package com.student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.model.Student;
import com.student.demo.repository.StudentHibernateRepository;


@Service
public class StudentService {
	
	int id = 0;

	@Autowired
	StudentHibernateRepository studentRepo;
	
	

	public int createStudent(Student student) {
		id++;
		student.setId(id);

		studentRepo.insertindatabase(student);
		return id;

	}

	public Student getStudent(int id) {

		Student student = studentRepo.selectfromdatabase(id);
		return student;

	}

}
