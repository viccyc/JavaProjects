package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Joe", "Bloggs");

//        email1.setMailboxCapacity(8);
//        System.out.println(email1.getMailboxCapacity());

        email1.setAlternateEmail("viccyc@email.com");
//        System.out.println(email1.getAlternateEmail());

        System.out.println(email1.showInfo());
    }
}
