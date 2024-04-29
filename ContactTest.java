package coreyHarvey61;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {

    @Test
    public void testSettersAndGetters() {
        // Create a contact.
        Contact contact = new Contact();

        // Set contact ID.
        contact.setContactId("1234567890");
        assertEquals("1234567890", contact.getContactId());

        // Set first name.
        contact.setFirstName("Stinky");
        assertEquals("Stinky", contact.getFirstName());

        // Set last name.
        contact.setLastName("Pinkerton");
        assertEquals("Pinkerton", contact.getLastName());

        // Set phone number.
        contact.setPhone("1234567890");
        assertEquals("1234567890", contact.getPhone());

        // Set address.
        contact.setAddress("123 Binky St");
        assertEquals("123 Binky St", contact.getAddress());
    }
}
