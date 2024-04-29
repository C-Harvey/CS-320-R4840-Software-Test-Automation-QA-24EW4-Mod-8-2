package coreyHarvey61;

public class Contact {
	
    private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public void setContactId(String contactId) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("The contact ID shall not be null and shall not be updatable.");
        }
        this.contactId = contactId;
    }
	
	public void setFirstName(String firstName) {
	    if (firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("Cannot be longer than 10 characters. The firstName field shall not be null.");
	    }
	    this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
	    if (lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Cannot be longer than 10 characters. The lastName field shall not be null.");
	    }
	    this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
	    if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
	        throw new IllegalArgumentException("The phone number must be exactly 10 digits. The phone field shall not be null.");
	    }
	    this.phone = phone;
	}
	
	public void setAddress(String address) {
	    if (address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Required address field must be no longer than 30 characters. The address field shall not be null.");
	    }
	    this.address = address;
	}
	
	//Getters
	
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
	
}
