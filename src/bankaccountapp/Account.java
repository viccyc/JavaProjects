package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and chequings account
//    int baseRate;
    // Constructor to set base properties and initialize account
//    public Account (int baseRate) {
//        this.baseRate = baseRate;
//    }
    public Account(String name) {
        System.out.println("Name: " + name);
        System.out.print("New Account: ");
    }

    // List common methods
}
