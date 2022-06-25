package com.list.arraylist;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        }
        else {
            System.out.println("Contact already exists");
            return false;
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i=0; i<myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0)
            return myContacts.get(position);
        else
            return null;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        if(findContact(newContact) >= 0) {
            System.out.println("Contact with name " + newContact.getName() + " already " +
                    "exists. Update was not successful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i<myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> "
            + myContacts.get(i).getPhoneNumber());
        }
    }

}
