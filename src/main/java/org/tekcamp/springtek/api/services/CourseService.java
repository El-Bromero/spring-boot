package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Course;
import org.tekcamp.springtek.api.repos.CourseRepo;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;


    public List<Course> findAllCourses() {
        return courseRepo.findAllCourses();
    }

    public Course getCourseById(int id) {
        return courseRepo.getCourseById(id);
    }

    public Course createCourse(Course newCourse) {
        return courseRepo.createCourse(newCourse);
    }

    public Course updateCourseById(int id, Course course) {
        return courseRepo.updateCourseById(id, course);
    }

    public void deleteCourseById(int id) {
        courseRepo.deleteCourseById(id);
    }
}
