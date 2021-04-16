package org.tekcamp.springtek.api.repos;

import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private List<Student> students = new ArrayList<>();

    public List<Student> findAllStudents() {
        return this.students;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentID() == id) {
                return student;
            }
        }
        return null;
    }

    public Student createStudent(Student newStudent) {
        students.add(newStudent);
        return students.get(students.size()-1);
    }

    public Student updateStudentById(int id, Student updateStudent) {
        for (Student student : students) {
            if (student.getStudentID() == id) {
                student.setFirstName(updateStudent.getFirstName());
                student.setLastName(updateStudent.getLastName());
                student.getCourses().clear();
                student.getCourses().addAll(updateStudent.getCourses());
            }
        }
        return null;
    }

    public void deleteStudentById(int id) {
        students.removeIf(student -> student.getStudentID() == id);
    }
}
