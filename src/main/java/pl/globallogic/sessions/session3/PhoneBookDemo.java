package pl.globallogic.sessions.session3;

import java.util.HashMap;

public class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook ourBook = new PhoneBook(new HashMap<>());
//Add contact(s) to phone book
        Contact alice = new Contact("Alice", "Smith", "123-456-7890");
        Contact bob = new Contact("Bob", "Doe", "987-654-3210");
        Contact charlie = new Contact("Charlie", "Johnson", "555-555-5555");
        Contact lucy = new Contact("Lucy", "Lamb", "555-555-5578");

        ourBook.addContact(alice);
        ourBook.addContact(bob);
        ourBook.addContact(charlie);
        ourBook.addContact(lucy);
//List phone book content
        ourBook.listContacts();
//Remove a contact from phone book
        ourBook.removeContact("Doe", "Bob");
        System.out.println("Do we have Doe, Bob in our book: " + ourBook.contactExist("Doe", "Bob"));
//Get contact from phone book
        System.out.println("Contact of Smith, Alice -> " + ourBook.getContact("Smith", "Alice"));

    }
}
