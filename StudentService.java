package com.shailez.sprinboot.sms.svs;

import java.util.List;

import com.shailez.sprinboot.sms.entities.Student;

public interface StudentService {
	
	List<Student>getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
