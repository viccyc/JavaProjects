package bankaccountapp;

public class Savings extends Account {
    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyAccessCode;

    // Constructor to initialize savings account properties
    public Savings(String name, int sIN, double initDeposit) {
        super(name, sIN, initDeposit);
        accountNumber = "2" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = random.nextInt(900) + 100;
        safetyAccessCode = random.nextInt(9000) + 1000;
    }

    // List methods specific to the savings account
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println(" Your Savings account features:" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Access Code: " + safetyAccessCode
        );
    }
}
