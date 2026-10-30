package com.automatetheplanet.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * The school registers students and creates courses.
 * Rules:
 * - the student number is unique inside the entire school
 * - course names are unique inside the school
 */
public class School {
    private final List<Student> students = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();

    public Student registerStudent(String name, int number) {
        Student student = new Student(name, number);
        for (Student existing : students) {
            if (existing.getName().equals(name)) {
                throw new IllegalArgumentException("Student number " + number + " is already used");
            }
        }
        students.add(student);
        return student;
    }

    public Course createCourse(String name) {
        if (findCourse(name).isPresent()) {
            throw new IllegalArgumentException("Course " + name + " already exists");
        }
        Course course = new Course(name);
        courses.add(course);
        return course;
    }

    public Optional<Student> findStudent(int number) {
        return students.stream()
                .filter(student -> student.getNumber() == number)
                .findFirst();
    }

    public Optional<Course> findCourse(String name) {
        return courses.stream()
                .filter(course -> course.getName().equals(name))
                .findFirst();
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
