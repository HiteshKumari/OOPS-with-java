package com.course.main;

import com.course.model.Student;
import com.course.model.Course;
import com.course.service.CourseService;


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Course Management System!");

        CourseService service = new CourseService();

        Course course = new Course(101, "Introduction to Programming", 2);
        service.addCourse(course);

        Student student1 = new Student(1, "Alice");

        try {
            service.enrollStudent(101, student1);
            System.out.println("Enrolled: " + student1.getStudentName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            service.enrollStudent(101, student1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student2 = new Student(2, "Bob");
            service.enrollStudent(101, student2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Charlie");
            service.enrollStudent(101, student3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.viewCourses();
    }
}
