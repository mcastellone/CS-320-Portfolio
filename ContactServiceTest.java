package contactservice;

import static org.junit.Assert.*;
import org.junit.Test;


public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("001", "John", "Gibson", "1234567890", "123 Main St");
        assertTrue(service.addContact(contact));
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("002", "Jane", "Smith", "0987654321", "456 Elm St");
        service.addContact(contact);
        assertTrue(service.deleteContact("002"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPhoneNumber() {
        new Contact("003", "Max", "Payne", "123", "789 Oak St");
    }


    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("004", "Alice", "Brown", "1234567890", "45 Grove St");
        service.addContact(contact);
        assertTrue(service.updateFirstName("004", "Alicia"));
    }

    @Test
    public void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("005", "Bob", "Jones", "1234567890", "12 Main St");
        service.addContact(contact);
        assertTrue(service.updateLastName("005", "Johnson"));
    }

    @Test
    public void testUpdatePhoneNum() {
        ContactService service = new ContactService();
        Contact contact = new Contact("006", "Eve", "Smith", "1234567890", "88 King St");
        service.addContact(contact);
        assertTrue(service.updateNumber("006", "0987654321"));
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("007", "Liam", "White", "1234567890", "22 Lake St");
        service.addContact(contact);
        assertTrue(service.updateAddress("007", "99 Ocean Ave"));
    }
}

