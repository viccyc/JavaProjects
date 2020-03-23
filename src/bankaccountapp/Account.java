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

        System.out.println("Name: " + this.name);
        System.out.println("SIN Number: " + this.sIN);
        System.out.println("Initial deposit: " + this.balance);
        System.out.print("New Account: ");

        uniqueNumber++;
        // Set account number
        this.accountNumber = setAccountNumber();
        System.out.println("accountNumber: " + this.accountNumber);
    }

    private String setAccountNumber() {
        // last 2 digits of SIN, unique 5-digit number and random 3-digit number
        int lastSinDigits = sIN % 100;
        int randomDigits = random.nextInt(900) + 100;
        accountNumber = Integer.toString(lastSinDigits) + Integer.toString(uniqueNumber) + Integer.toString(randomDigits);
        return accountNumber;
    }

    // List common methods
}

