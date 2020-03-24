package bankaccountapp;

public class Chequings extends Account {
    // List properties specific to a chequings account
    long debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize chequings account properties
    public Chequings(String name, int sIN, double initDeposit) {
        super(name, sIN, initDeposit);
        accountNumber = "1" + accountNumber;
        assignDebitCard();
    }

    private void assignDebitCard() {
        debitCardNumber = (long)(Math.random() * Math.pow(10, 16));
        debitCardPIN = random.nextInt(9000) + 1000;
    }

    // List an methods specific to the chequings account
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Chequings account features:" +
                    "\n Debit card number: " + debitCardNumber +
                    "\n Card PIN: " + debitCardPIN
        );
    }
}
