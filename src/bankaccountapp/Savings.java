package bankaccountapp;

public class Savings extends Account {
    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyAccessCode;

    // Constructor to initialize savings account properties
    public Savings(String name, int sIN, double initDeposit) {
        super(name, sIN, initDeposit);
        accountNumber = "2" + accountNumber;
    }
    // List methods specific to the savings account
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Type: Savings account");
    }
}
