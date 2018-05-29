package model;

import java.util.ArrayList;

public class AllContacts {
private ArrayList<Contact> allContacts;

    public AllContacts() {
    }

    protected void addContact (Contact contact){
        allContacts.add(contact);
    }

    static public ArrayList<Contact> getDefaultContacts(){

        ArrayList<MailAdress> beispielAdresses = new ArrayList<>();
        beispielAdresses.add(new MailAdress("tester.beispielname@beuth-hochschule.de"));

        ArrayList<MailAdress> mustermannAdresses = new ArrayList<>();
        mustermannAdresses.add(new MailAdress("erika.mustermann@beuth-hochschule.de"));
        mustermannAdresses.add(new MailAdress("erika.mustermann@web.de"));

        ArrayList<MailAdress> testAdresses = new ArrayList<>();
        testAdresses.add(new MailAdress("test.test@beuth-hochschule.de"));
        testAdresses.add(new MailAdress("test.test@web.de"));
        testAdresses.add(new MailAdress("mail.test@gmx.de"));

        ArrayList<MailAdress> petersonAdresses = new ArrayList<>();



        ArrayList<Contact> defaultContacts = new ArrayList<>();
        defaultContacts.add(new Contact("Tester", "Beispielname", "Teststraße 10", "02347", "Teststadt", "01560286537", beispielAdresses, "kontakt1.png"));
        defaultContacts.add(new Contact("Erika", "Mustermann", "Musterstraße 10", "12345", "Musterstadt", "01230987654", mustermannAdresses, "kontakt2.png"));
        defaultContacts.add(new Contact("Test", "Testname", "Testerweg 34", "90765", "Testdorf", "09537219343", testAdresses, "kontakt3.png"));
        defaultContacts.add(new Contact("Peter", "Peterson", "Beispiel 34", "23946", "Bspstadt", "23487628343", petersonAdresses));




        return defaultContacts;
    }
}
