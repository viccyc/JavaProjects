package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // ask how many students will be added to the db
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        // Create n number of new students
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enrollInCourses();
            students[i].payTuition();
            System.out.println(students[i].showStudentInfo());
        }
    }
}
