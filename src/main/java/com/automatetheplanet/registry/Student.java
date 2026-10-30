package com.automatetheplanet.registry;

import java.util.Objects;

/**
 * A student of the school.
 * Rules:
 * - the name can not be empty
 * - the number is between 10000 and 99999 (both included)
 * Two students are equal when they have the same number.
 */
public class Student {
    public static final int MIN_NUMBER = 10000;
    public static final int MAX_NUMBER = 99999;

    private final String name;
    private final int number;

    public Student(String name, int number) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty");
        }
        if (number < MIN_NUMBER || number >= MAX_NUMBER) {
            throw new IllegalArgumentException(
                    "Number must be between " + MIN_NUMBER + " and " + MAX_NUMBER + " but was " + number);
        }
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Student student)) {
            return false;
        }
        return number == student.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return name + " (" + number + ")";
    }
}
