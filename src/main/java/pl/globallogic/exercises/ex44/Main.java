package pl.globallogic.exercises.ex44;

public class Main {
    public static void main(String[] args) {
//tests

        MobilePhone phone = new MobilePhone("1234567890");

        Contact bob = Contact.createContact("Bob", "111111");
        Contact alice = Contact.createContact("Alice", "222222");
        Contact tom = Contact.createContact("Tom", "333333");
        Contact jane = Contact.createContact("Jane", "444444");

        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.addNewContact(tom);
        phone.addNewContact(jane);

        phone.printContacts();

        Contact newBob = Contact.createContact("Bob", "xxxxxx");
        phone.updateContact(bob, newBob);
        phone.removeContact(alice);

        phone.printContacts();

        System.out.println("Query Bob: " + phone.queryContact("Bob").getPhoneNumber());
        System.out.println("Query Alice: " + phone.queryContact("Alice"));
    }
}
