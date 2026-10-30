package com.automatetheplanet.registry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

/**
 * Tests for the School rules:
 * - the student number is unique inside the entire school
 * - course names are unique inside the school
 *
 * Implement every test: replace Assertions.fail(...) with Arrange, Act and Assert.
 */
public class SchoolTests {
    private School school;

    @BeforeEach
    public void testInit() {
        school = new School();
    }

    @Test
    public void registerStudent_addsStudentToSchool() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void sameNumberWithDifferentName_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void sameNameWithDifferentNumbers_registersBothStudents() {
        Assertions.fail("TODO: implement this test");
    }

    @ParameterizedTest
    // TODO: add @CsvSource({...}) with name, number pairs that must be rejected
    public void invalidStudent_isNotRegistered(String name, int number) {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void unknownNumber_findsNoStudent() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void createCourse_addsCourseToSchool() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void duplicateCourseName_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void unknownCourseName_findsNoCourse() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void student_canJoinTwoCourses() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void studentAndCourseLists_cannotBeChangedFromOutside() {
        Assertions.fail("TODO: implement this test");
    }
}
