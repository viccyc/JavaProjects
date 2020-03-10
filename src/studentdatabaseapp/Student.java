package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String course;
    private static int courseCost = 600;
    private int tuitionBalance;
    private static int id = 1000;

    // constructor to prompt for student name and year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter studnet year level: ");
        this.gradeYear = input.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
    }

    // create student 5-digit unique ID, first digit is grade level
    private void setStudentID() {
        id++;
        this.studentId = (gradeYear + "" + id);
    }

    // enroll in course

    // get the balance of the student

    // pay tuition

    // show status of student
}
