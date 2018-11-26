package com.student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.Student;
import com.student.demo.service.StudentService;



@RestController
public class StudentHController {
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/student")
	public int createTeacher(@RequestBody Student student) {
		int id = studentService.createStudent(student);
		return id;

	}

	@GetMapping(value = "/student/{id}")
	public Student getTeacher(@PathVariable int id) {
		Student student =  studentService.getStudent(id);
		return student;

	}

//	@GetMapping(value = "/teacher/{id}/course/{courseid}")
//	public Teacher getTeacherCourse(@PathVariable int id, @PathVariable int courseid) {
//
//		System.out.println("Teacher id is: " + id + " and course id is: " + courseid);
//		Teacher teacher = new Teacher();
//		teacher = teacherServic.getTeacher(id);
//		return teacher;
//
//	}
//
//	@DeleteMapping(value = "/teacher/{id}")
//	public int deleteTeacher(@PathVariable int id) {
//		int deletedStdId = teacherServic.deleteTeacher(id);
//		return deletedStdId;
//
//	}
//
//	@PutMapping(value = "/teacher/{id}")
//	public Teacher createTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
//		Teacher updatedTeacher = new Teacher();
//		updatedTeacher = teacherServic.updateTeacher(id, teacher);
//		return updatedTeacher;
//
//	}

}
