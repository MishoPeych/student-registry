# B-03 Exercise: Student Registry

The code in `src/main/java` is ready. Your job is to **test it**, not to rewrite it.

## The rules (the requirements)

**Student**
- The name can not be empty.
- The number is between 10000 and 99999 (both included).

**School**
- The student number is unique inside the entire school.
- Course names are unique inside the school.

**Course**
- A course holds at most 30 students.
- A student can join a course only once.
- A student can leave a course only if they are in it.

Every broken rule throws an exception (`IllegalArgumentException` or `IllegalStateException`).

## Your tasks

1. Open the project in IntelliJ IDEA (File > Open > select this folder).
2. Implement the tests in `StudentTests`, `CourseTests` and `SchoolTests`.
   The test methods are already there: each name says what to check, and each body is `Assertions.fail("TODO ...")`.
   Replace the `fail(...)` with Arrange, Act and Assert. `validNameAndNumber_createsStudent` is a ready example.
   - Test the valid cases **and** the invalid ones.
   - Test the edges: the smallest and the biggest allowed values, and one step outside them.
   - For each `@ParameterizedTest`, add the data source (`@ValueSource` or `@CsvSource`) with the values you choose.
   - Use `assertThrows` for the rules that must throw an exception.
   - Follow Arrange-Act-Assert. If you add more tests, name them `scenario_expectedResult`.
3. Run the tests: right-click `src/test/java` > Run 'All Tests', or `mvn test`.
4. Check the coverage: right-click `src/test/java` > More Run/Debug > Run 'All Tests' with Coverage. Get at least 90%.

## Important

**The code has bugs.** A good test suite finds them.
When a test fails, first check the rules above: is the test wrong, or the code?
Do not change the code to make your tests pass. Keep the failing test and write down the bug:
what you did, what you expected, and what happened.

Hand in: your test classes and your list of bugs.

## Requirements

- Java 21
- Maven 3.9+ (IntelliJ IDEA has it built in)
