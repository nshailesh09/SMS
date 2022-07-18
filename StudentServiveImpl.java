package com.shailez.sprinboot.sms.svs.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.shailez.sprinboot.sms.entities.Student;
import com.shailez.sprinboot.sms.repos.StudentRepository;
import com.shailez.sprinboot.sms.svs.StudentService;

@Service
public class StudentServiveImpl implements StudentService{
	
	private StudentRepository repos;
	
	public StudentServiveImpl(StudentRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public List<Student> getAllStudents(){
		return repos.findAll();
	};
	
	@Override
	public Student saveStudent(Student student) {
		return repos.save(student);
	}
	
	@Override
	public Student getStudentById(Long id) {
		return repos.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student) {
		return repos.save(student);
	}
	
	@Override
	public void deleteStudentById(Long id) {
		repos.deleteById(id);
	}
	
}