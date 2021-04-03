package com.tw.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/class/students")
    public List<Student> getStudents(@PathVariable String students) {
        return studentService.getStudents();
    }

    @PostMapping("/class")
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    public void deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
    }


}
