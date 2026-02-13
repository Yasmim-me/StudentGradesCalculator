//package studentgradescalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void testAverageNormalGrades() {
        int[] grades = {85, 90, 78, 92, 88};
        Student s = new Student("John Doe", grades);
        assertEquals(86.6, s.getAverageGrade(), 0.1);
    }

    @Test
    void testAverageAllSameGrades() {
        int[] grades = {100, 100, 100, 100, 100};
        Student s = new Student("Perfect Student", grades);
        assertEquals(100.0, s.getAverageGrade(), 0.1);
    }

    @Test
    void testAverageEmptyGrades() {
        int[] grades = {};
        Student s = new Student("No Grades", grades);
        assertEquals(0.0, s.getAverageGrade(), 0.1);
    }

    @Test
    void testAverageSingleGrade() {
        int[] grades = {75};
        Student s = new Student("One Grade", grades);
        assertEquals(75.0, s.getAverageGrade(), 0.1);
    }

    @Test
    void testAverageNullGrades() {
        Student s = new Student("Null Grades", null);
        assertEquals(0.0, s.getAverageGrade(), 0.1);
    }
}
