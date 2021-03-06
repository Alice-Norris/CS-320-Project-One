package com.alicek.contactService;

public class Contact {
    //private fields for contacts
    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;
    
    //Constructor for contact objects. Takes four strings, supplied by user, and a contactID, generated by Contact Service
    public Contact(String firstName, String lastName, String phoneNum, String address, String contactId) {

        //make sure each field is within length restraints and isn't null, throwing an exception
        //as necessary.
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNum(phoneNum);
        this.setAddress(address);

        //no setter, testing Contact ID to ensure it isn't null, too long, or negative.
        if (contactId == null || contactId.length() > 10 || Long.parseLong(contactId, 36) < 0) {
            throw new IllegalArgumentException("Invalid Task ID! Must be a string of 10 characters or less.");
        }
        this.contactId = contactId;
    }

    //Getters and setters follow past this point
    //All setters check for valid input, to ensure that a contact isn't updated with invalid data.
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name invalid, must be a String of ten characters or less!");
        }
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name invalid, must be a String of ten characters or less!");
        }
        this.lastName = lastName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        if (phoneNum == null || phoneNum.length() != 10) {
            throw new IllegalArgumentException("Phone number invalid, must be exactly ten characters!");
        }
        this.phoneNum = phoneNum;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address invalid, must be a String of thirty characters or less!");
        }
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }
}
