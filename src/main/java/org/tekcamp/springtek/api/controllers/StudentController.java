package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tekcamp.springtek.api.entities.Student;
import org.tekcamp.springtek.api.services.StudentService;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping(path = "/id/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student newStudent) {
        return studentService.createStudent(newStudent);
    }

    @PutMapping(value = "/id/{id}")
    public Student updateStudentById(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudentById(id, student);
    }

    @DeleteMapping(value = "/id/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }
}
