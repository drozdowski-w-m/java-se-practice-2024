package pl.globallogic.exercises.ex44;

import java.util.ArrayList;
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if ( myContacts.contains(contact) )
            return false;
        else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact old, Contact update){
        int index = myContacts.indexOf(old);
        if (index == -1)
            return false;
        else {
            myContacts.set(index, update);
            return true;
        }
    }

    public boolean removeContact(Contact contact){
        int index = myContacts.indexOf(contact);
        if (index == -1)
            return false;
        else {
            myContacts.remove(index);
            return true;
        }
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if ( myContacts.get(i).getName().equals(name) )
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if ( index == -1 )
            return null;
        else
            return myContacts.get(index);
    }

    public void printContacts(){
        System.out.println("Contact list: ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) +". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());

        }
    }

    public class Contact {
        private String name, phoneNumber;

        public Contact(String name, String phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public static Contact createContact(String name, String phoneNumber){
            return new Contact(name, phoneNumber);
        }
    }

    public static void main(String[] args) {
//tests
        MobilePhone phone = new MobilePhone("1234567890");

        Contact bob = Contact.createContact("Bob", "111111");
        Contact alice = Contact.createContact("Alice", "222222");
        Contact tom = Contact.createContact("Tom", "333333");
        Contact jane = Contact.createContact("Jane","444444");

        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.addNewContact(tom);
        phone.addNewContact(jane);

        phone.printContacts();
    }
}
