package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.enrollInCourses();
        newStudent.payTuition();
        System.out.println(newStudent.showStudentInfo());
        // ask how many students will be added to the db

        // Create n number of new students
    }
}
