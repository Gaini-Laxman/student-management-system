package com.klinnovations.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.klinnovations.sms.repository.StudentRepository;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student student1 = new Student("Laxman","Gaini","laxman@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Anitha","Gaini","anitha@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Sailu","Dhuda","sailu@gmail.com");
		 * studentRepository.save(student3);
		 * 
		 * Student student4 = new Student("Raju","Dhuda","raju@gmail.com");
		 * studentRepository.save(student4);
		 * 
		 * Student student5 = new Student("Naveen","Gaini","naveen@gmail.com");
		 * studentRepository.save(student5);
		 */
		
		
	}

}
