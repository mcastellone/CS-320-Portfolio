package contactservice;

import static org.junit.Assert.*;
import org.junit.Test;


@SuppressWarnings("unused")
public class ContactTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullContactID() {
        new Contact(null, "Joe", "Graham", "8934834242", "123 Oak St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        new Contact("001", null, "Graham", "8934834242", "123 Oak St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLastName() {
        new Contact("002", "Joe", null, "8934834242", "123 Oak St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPhoneNum() {
        new Contact("003", "Joe", "Graham", null, "123 Oak St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullAddress() {
        new Contact("004", "Joe", "Graham", "8934834242", null);
    }
}

