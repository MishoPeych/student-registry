package com.automatetheplanet.registry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests for the Student rules:
 * - the name can not be empty
 * - the number is between 10000 and 99999 (both included)
 * <p>
 * The first test is a ready example. Implement the others:
 * replace Assertions.fail(...) with Arrange, Act and Assert.
 */
public class StudentTests {

    @Test
    public void validNameAndNumber_createsStudent() {
        // Arrange + Act
        Student student = new Student("Maria", 12345);

        // Assert
        Assertions.assertEquals("Maria", student.getName());
        Assertions.assertEquals(12345, student.getNumber());
    }

    @ParameterizedTest
    @ValueSource(ints = {10000,22222} )
    // TODO: add @ValueSource(ints = {...}) with numbers that must be accepted. Remember the edges!
    public void numberInsideRange_isAccepted(int number) {
        String name = "Misho";
        Student student = new Student(name, number);
        Assertions.assertEquals(number, student.getNumber());
        Assertions.assertEquals(name, student.getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    // TODO: add @ValueSource(ints = {...}) with numbers that must be rejected. Remember the edges!
    public void numberOutsideRange_throwsException(int number) {
        String name = "Gosho";
        Student student = new Student(name, number);
        Assertions.assertEquals(number, student.getNumber());
        Assertions.assertEquals(name, student.getName());
    }

    @Test
    public void nullName_throwsException() {
        Assertions.fail("TODO: implement this test");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Maria","Gosho","Sasho"})
    // TODO: add @ValueSource(strings = {...}) with names that count as empty
    public void emptyName_throwsException(String name) {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void studentsWithSameNumber_areEqual() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void studentsWithDifferentNumbers_areNotEqual() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void student_isEqualToItselfButNotToOtherTypes() {
        Assertions.fail("TODO: implement this test");
    }

    @Test
    public void toString_containsNameAndNumber() {
        Assertions.fail("TODO: implement this test");
    }
}
