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

        System.out.println("10 - Grade 10\n11 - Grade 11\n12 - Grade 12\nEnter student year level: ");
        this.gradeYear = input.nextInt();

        setStudentID();
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
                    courses = "\n  " + chosenCourse;
                } else {
                    courses += "\n  " + chosenCourse;
                }
                tuitionBalance += courseCost;
            } else { break; }
        } while (1 != 0);
    }

    // get the balance of the student
    public void getBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        getBalance();
        System.out.print("Enter amount you would like to pay in $:");
        Scanner payment = new Scanner(System.in);

        int paymentReceived = payment.nextInt();
        tuitionBalance -= paymentReceived;
        System.out.println("Thank you for your payment of $" + paymentReceived);
        getBalance();
    }

    // show status and info of student
    public String showStudentInfo() {
        return "Student: " + firstName + " " + lastName
                + "\n Student ID: " + studentId
                + "\n Grade: " + gradeYear
                + "\n Courses enrolled in: " + courses
                + "\n Remaining tuition: $" + tuitionBalance;
    }
}
