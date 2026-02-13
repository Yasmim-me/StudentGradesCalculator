//package studentgradescalculator;

import java.util.Arrays;
//Define a class named Student with the following attributes:
//name (String): The name of the student.
//grades (array of integers): An array to store the student's grades
// for different subjects.
public class Student {
    private String name;
    private int[] grades;

    // constructor
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    //Implement the following methods within the Student class:
    //getAverageGrade(): A function that calculates and returns the average
    // grade of the student.
    public double getAverageGrade() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // getters
    public String getName() {
        return name;
    }
    public int[] getGrades() {
        return grades;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Grades: " + Arrays.toString(grades).replaceAll("[\\[\\],]", "") + "\n" +
                "Average Grade: " + String.format("%.1f", getAverageGrade());
    }
}

