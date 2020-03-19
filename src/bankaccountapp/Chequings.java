package bankaccountapp;

public class Chequings extends Account {
    // List properties specific to a chequings account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize chequings account properties
    public Chequings(String name, int sIN, double initDeposit) {
        super(name, sIN, initDeposit);
        System.out.println("chequings account");
    }

    // List an methods specific to the chequings account
}
