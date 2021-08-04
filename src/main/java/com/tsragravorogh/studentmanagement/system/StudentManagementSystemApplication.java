package com.tsragravorogh.studentmanagement.system;

import com.tsragravorogh.studentmanagement.system.entity.Student;
import com.tsragravorogh.studentmanagement.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Misha", "Goncharov", "misha@yandex.ru");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Masha", "Goncharova", "masha@yandex.ru");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Kolya", "Goncharov", "kolya@yandex.ru");
//		studentRepository.save(student3);
	}
}
