package contactservice;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact2) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contact2.getContactID()))
                return false;
        }
        contacts.add(contact2);
        return true;
    }

    public boolean deleteContact(String contactID) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contactID)) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    public boolean updateFirstName(String contactID, String newFirstName) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contactID)) {
                contact.setFirstName(newFirstName);
                return true;
            }
        }
        return false;
    }

    public boolean updateLastName(String contactID, String newLastName) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contactID)) {
                contact.setLastName(newLastName);
                return true;
            }
        }
        return false;
    }

    public boolean updateNumber(String contactID, String newNumber) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contactID)) {
                contact.setPhoneNum(newNumber);
                return true;
            }
        }
        return false;
    }

    public boolean updateAddress(String contactID, String newAddress) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equalsIgnoreCase(contactID)) {
                contact.setAddress(newAddress);
                return true;
            }
        }
        return false;
    }
}
