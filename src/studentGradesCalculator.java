import java.util.Scanner;

public class studentGradesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_STUDENTS = 5;
        final int NUM_SUBJECTS = 5;

        Student[] students = new Student[NUM_STUDENTS];
        double classSum = 0;

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] grades = new int[NUM_SUBJECTS];
            System.out.print("Grades: ");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                grades[j] = sc.nextInt();
            }
            sc.nextLine();

            Student s = new Student(name, grades);
            students[i] = s;

            System.out.println("Average Grade: " + String.format("%.1f", s.getAverageGrade()));
            System.out.println();

            classSum += s.getAverageGrade();
        }

        double classAverage = classSum / NUM_STUDENTS;
        System.out.println("Class Average Grade: " + String.format("%.1f", classAverage));

        sc.close();
    }
}

