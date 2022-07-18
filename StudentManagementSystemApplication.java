package com.shailez.sprinboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shailez.sprinboot.sms.entities.Student;
import com.shailez.sprinboot.sms.repos.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository repos;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
//		Student stud1 = new Student("Ramesh","Uppala","ramesh@gmail.com");
//		repos.save(stud1);
//		
//		Student stud2 = new Student("Sathish","Uppala","sathish@gmail.com");
//		repos.save(stud2);
//		
//		Student stud3 = new Student("Naveen","Uppala","naveen@gmail.com");
//		repos.save(stud3);
		
	}

}
