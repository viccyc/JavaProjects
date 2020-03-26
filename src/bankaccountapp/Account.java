package bankaccountapp;
import java.util.Random;


public abstract class Account implements IBaseRate {
    // List common properties for savings and chequings account
    String name;
    int sIN;
    double balance;
    double baseRate;
    static int uniqueNumber = 10000;
    String accountNumber;
    Random random = new Random();
    // Constructor to set base properties and initialize account
//    public Account (int baseRate) {
//        this.baseRate = baseRate;
//    }
    public Account(String name, int sIN, double initDeposit) {
        this.name = name;
        this.sIN = sIN;
        this.balance = initDeposit;

        uniqueNumber++;
        // Set account number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    // abstract so that the sub account classes must implement this method in the class
    public abstract void setRate();

    private String setAccountNumber() {
        // last 2 digits of SIN, unique 5-digit number and random 3-digit number
        int lastSinDigits = sIN % 100;
        int randomDigits = random.nextInt(900) + 100;
        accountNumber = Integer.toString(lastSinDigits) + Integer.toString(uniqueNumber) + Integer.toString(randomDigits);
        return accountNumber;
    }

    // List common methods
    public void showAccountInfo() {
        System.out.println(
                    "Name: " + name +
                    "\nSIN Number: " + sIN +
                    "\nAccount Number: " + accountNumber +
                    "\nBalance: " + balance +
                    "\nBase rate: " + baseRate + "%"
        );
    }
}

