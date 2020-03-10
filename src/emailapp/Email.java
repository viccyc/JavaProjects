package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private int mailboxCapacity = 500;
    private int defaultPwdLength = 10;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call method to ask for department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPwdLength);

        // Combine elements into an email address
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;

    }

    // Ask for the department
    private String setDepartment() {
        // gives options and then captures the input
        System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner input = new Scanner(System.in);
        int deptChoice = input.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a remote password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!$#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get methods
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    // Get all info
    public String showInfo() {
        System.out.println();
        return "\nNew Account Created for: " + this.firstName + " " + this.lastName +
                "\nThe new email is: " + email +
                            "\nThe alternate email is: " + alternateEmail
                            + "\nThe generated password is: " + password
                            + "\nThe department code is: " + department
                            + "\nThe mailbox capacity is: " + mailboxCapacity
                            + "\nTell our new employee to have an awesome day!!";
    }
}
