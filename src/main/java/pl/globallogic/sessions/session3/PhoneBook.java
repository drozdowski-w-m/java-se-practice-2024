package pl.globallogic.sessions.session3;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        contacts.put(contact.fullName(), contact);
    }

    public Contact getContact(String lastName, String firstName){
        String fullName = getFullName(lastName, firstName);
        return contacts.get(fullName);
    }

    private String getFullName(String lastName, String firstName){
        return lastName + ", " + firstName;
    }

    public boolean removeContact(String lastName, String firstName){
        String fullName = getFullName(lastName, firstName);
        if (contactExist(lastName, firstName)){
            contacts.remove(fullName);
            return true;
        }
        return false;
    }

    public void listContacts(){
        System.out.println("Your contacts: ");
        for(Map.Entry<String, Contact> contact : contacts.entrySet() ){
            System.out.println(contact.getValue());
        }
    }

    public boolean contactExist(String lastName, String firstName){
        return contacts.containsKey(getFullName(lastName,firstName));
    }
}
