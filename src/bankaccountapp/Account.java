package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and chequings account
    String name;
    int sIN;
    double balance;
    double baseRate;
    String accountNumber;
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
    }

    // List common methods
}
