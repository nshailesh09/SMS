package com.shailez.sprinboot.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shailez.sprinboot.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
