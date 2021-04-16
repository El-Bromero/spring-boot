package org.tekcamp.springtek.api.repos;

import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    private List<Course> courses = new ArrayList<>();


    public List<Course> findAllCourses() {
        return this.courses;
    }

    public Course getCourseById(int id) {
        for (Course course : courses) {
            if (course.getCourseID() == id) {
                return course;
            }
        }
        return null;
    }

    public Course createCourse(Course newCourse) {
        courses.add(newCourse);
        return courses.get(courses.size()-1);
    }

    public Course updateCourseById(int id, Course updateCourse) {
        for (Course course : courses) {
            if (course.getCourseID() == id) {
                course.setName(updateCourse.getName());
                course.setInstructor(updateCourse.getInstructor());
                course.setCredits(updateCourse.getCredits());
                return course;
            }
        }
        return null;
    }

    public void deleteCourseById(int id) {
        courses.removeIf(course -> course.getCourseID() == id);
    }
}
