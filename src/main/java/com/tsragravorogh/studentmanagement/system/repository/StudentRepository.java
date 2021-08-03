package com.tsragravorogh.studentmanagement.system.repository;

import com.tsragravorogh.studentmanagement.system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}