package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {
        Chequings chAccount = new Chequings("Viccy Grace", 951753246, 1500);
        Savings savAccount = new Savings("Lennon Blue", 578961235, 2800);

        chAccount.showAccountInfo();
        savAccount.showAccountInfo();

        chAccount.deposit(1215);
        savAccount.withdraw(27);
        savAccount.transfer("Mortgage", 50);

        // Read a CSV file then create new accounts based on that data
    }
}
