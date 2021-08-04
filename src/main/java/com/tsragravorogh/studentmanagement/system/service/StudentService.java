package com.tsragravorogh.studentmanagement.system.service;

import com.tsragravorogh.studentmanagement.system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);
}
