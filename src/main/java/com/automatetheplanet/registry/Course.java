package com.automatetheplanet.registry;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A course with a set of students.
 * Rules:
 * - the course name can not be empty
 * - a course holds at most 30 students
 * - a student can join a course only once
 * - a student can leave a course only if they are in it
 */
public class Course {
    public static final int MAX_STUDENTS = 30;

    private final String name;
    private final Set<Student> students = new LinkedHashSet<>();

    public Course(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Course name can not be empty");
        }
        this.name = name;
    }

    public void join(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can not be null");
        }
        if (students.contains(student)) {
            throw new IllegalArgumentException(student + " is already in course " + name);
        }
        if (students.size() > MAX_STUDENTS) {
            throw new IllegalStateException("Course " + name + " is full (" + MAX_STUDENTS + " students)");
        }
        students.add(student);
    }

    public void leave(Student student) {
        if (!students.remove(student)) {
            throw new IllegalArgumentException(student + " is not in course " + name);
        }
    }

    public boolean hasStudent(Student student) {
        return students.contains(student);
    }

    public int getStudentCount() {
        return students.size();
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public String getName() {
        return name;
    }
}
