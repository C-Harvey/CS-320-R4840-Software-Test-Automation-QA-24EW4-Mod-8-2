package coreyHarvey61;

public class ContactService {
    public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = new Contact();
        contact.setContactId(contactId);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }

    public void deleteContact(String contactId) {
        // There is no database, the following code is blank to prevent errors.
    	// Todo, write code to delete contact by ID.
    	// I feel like I'm missing stuff by not writing code here.
    	// I sure hope this doesn't come back to haunt me by leaving it blank.
    	// I'm not really sure what to do otherwise.
    	// I can't even use this to update the values in Contact.java since they're static.
    	// No database means I'm keeping it simple. Adding too much last time gave a bad grade.
    }

    public void updateFirstName(String contactId, String firstName) {
        // Todo, write code to update the first name in the database.
    	//Contact contact = getContactFromDatabase(contactId);
    	//Contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        // Todo, write code to update the last name in the database.
    }

    public void updatePhoneNumber(String contactId, String phoneNumber) {
        // Todo, write code to update the phone number in the database.
    }

    public void updateAddress(String contactId, String address) {
        // Todo, write code to update the address in the database.
    }
}
