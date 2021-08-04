package com.tsragravorogh.studentmanagement.system.service;

import com.tsragravorogh.studentmanagement.system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
