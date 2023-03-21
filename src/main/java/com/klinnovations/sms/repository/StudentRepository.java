package com.klinnovations.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
