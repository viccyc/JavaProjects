package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "none";
    private static int courseCost = 600;
    private int tuitionBalance = 0;
    private static int id = 1000;

    // constructor to prompt for student name and year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student year level: ");
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
    public void enrollInCourses() {
        do {
            System.out.print("Enter course to enroll in (Q to quit): ");
            Scanner courseInput = new Scanner(System.in);
            String chosenCourse = courseInput.nextLine();
            if (!chosenCourse.equals("Q")) {
                if (courses.equals("none")) {
                    courses = "\n" + chosenCourse;
                } else {
                    courses += "\n" + chosenCourse;
                }
                tuitionBalance += courseCost;
            } else { break; }
        } while (1 != 0);
        System.out.println("COURSES ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // get the balance of the student

    // pay tuition

    // show status of student
}
