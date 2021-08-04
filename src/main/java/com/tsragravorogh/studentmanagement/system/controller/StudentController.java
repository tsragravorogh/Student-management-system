package com.tsragravorogh.studentmanagement.system.controller;

import com.tsragravorogh.studentmanagement.system.entity.Student;
import com.tsragravorogh.studentmanagement.system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students and return mode and view

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    @GetMapping
    public String createStudentForm(Model model){
        // create student object to hold from data
        Student student = new Student();

    }
}
