package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tekcamp.springtek.api.entities.Course;
import org.tekcamp.springtek.api.services.CourseService;

import java.util.List;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping(path = "/id/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course newCourse) {
        return courseService.createCourse(newCourse);
    }

    @PutMapping(value = "/id/{id}")
    public Course updateCourseById(@PathVariable int id, @RequestBody Course course) {
        return courseService.updateCourseById(id, course);
    }

    @DeleteMapping(value = "/id/{id}")
    public void deleteCourseById(@PathVariable int id) {
        courseService.deleteCourseById(id);
    }
}
