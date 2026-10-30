package com.automatetheplanet.registry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

/**
 * Tests for the Course rules:
 * - the course name can not be empty
 * - a course holds at most 30 students
 * - a student can join a course only once
 * - a student can leave a course only if they are in it
 *
 * Implement every test: replace Assertions.fail(...) with Arrange, Act and Assert.
 */
public class CourseTests {
    private Course course;

    @BeforeEach
    public void testInit() {
        course = new Course("Java Basics");
    }

    // Helper: adds 'count' different students to the course.
    // Tip: every student needs a different number, e.g. 10000 + i
    private void addStudents(int count) {
        Assertions.fail("TODO: implement this helper");
    }

    @Test
    public void newCourse_hasNameAndNoStudents() {
        Assertions.fail("TODO: implement this test");
    }

    @ParameterizedTest
    // TODO: add @ValueSource(strings = {...}) with course names that count as empty
    public void emptyCourseName_throwsException(String name) {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void nullCourseName_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void join_addsStudentToCourse() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void joinTwice_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void joinNull_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void thirtyStudents_canJoin() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void thirtyFirstStudent_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void leave_removesStudentFromCourse() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void leaveWhenNotInCourse_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void studentWhoLeft_canJoinAgain() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void fullCourse_acceptsStudentAfterOneLeaves() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void studentList_cannotBeChangedFromOutside() {
        Assertions.fail("TODO: implement this test");
    }
}
