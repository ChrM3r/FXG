package model;

import java.util.ArrayList;

public class AllContacts {
private ArrayList<Contact> allContacts;

    public AllContacts(ArrayList<Contact> allContacts) {
        this.allContacts = allContacts;
    }

    protected void addContact (Contact contact){
        allContacts.add(contact);
    }
}
