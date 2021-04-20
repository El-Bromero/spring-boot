package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Student;
import org.tekcamp.springtek.api.repos.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    public List<Student> findAllStudents() {
        return studentRepo.findAllStudents();
    }

    public Student getStudentById(int id) {
        return studentRepo.getStudentById(id);
    }

    public Student createStudent(Student newStudent) {
        return studentRepo.createStudent(newStudent);
    }

    public Student updateStudentById(int id, Student student) {
        return studentRepo.updateStudentById(id, student);
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteStudentById(id);
    }
}
