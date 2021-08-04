package com.tsragravorogh.studentmanagement.system.impl;

import com.tsragravorogh.studentmanagement.system.entity.Student;
import com.tsragravorogh.studentmanagement.system.repository.StudentRepository;
import com.tsragravorogh.studentmanagement.system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
