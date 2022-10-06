package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Hello");
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student1=new Student("Ramesh","Kumar","ramesh@gamil.com");
		studentRepository.save(student1);
		Student student2=new Student("Ram","Kumar","ram@gamil.com");
		studentRepository.save(student2);
				Student student3=new Student("Suresh","Kumar","suresh@gamil.com");
		studentRepository.save(student3);
		
		
	}

}
