package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactCSVImport {

    //Karma
    static public void kontakteEinlesen() throws IOException {

        try (Scanner inputStream = new Scanner(new File("/Volumes/Daten/Dokumente/Studium/2. Semester/Grundlagen der Programmierung II/FXGE1Contacts/src/resources/defaultcontacts.csv"))) {

            while (inputStream.hasNext()) {

                ArrayList<MailAdress> adresses = new ArrayList<>();
                MailAdress mailAdress;
                AllMailAdresses neueMailAdresses;
                String csvZeile = inputStream.next();
                String[] einzelWerte = csvZeile.split(";");

                if (einzelWerte.length >= 8) {
                    mailAdress = new MailAdress(einzelWerte[7]);
                    if (mailAdress.getAdresse() != null)
                        adresses.add(mailAdress);
                }
                if (einzelWerte.length >= 9) {
                    mailAdress = new MailAdress(einzelWerte[8]);
                    if (mailAdress.getAdresse() != null)
                        adresses.add(mailAdress);
                }
                if (einzelWerte.length >= 10) {
                    mailAdress = new MailAdress(einzelWerte[9]);
                    if (mailAdress.getAdresse() != null)
                        adresses.add(mailAdress);
                }

                Contact neuerKontakt;
                if (einzelWerte.length < 11) {
                    neueMailAdresses = new AllMailAdresses(adresses);
                    neuerKontakt = new Contact(einzelWerte[0], einzelWerte[1], einzelWerte[2], einzelWerte[3], einzelWerte[4], einzelWerte[5], einzelWerte[6], neueMailAdresses);
                } else {
                    neueMailAdresses = new AllMailAdresses(adresses);
                    neuerKontakt = new Contact(einzelWerte[0], einzelWerte[1], einzelWerte[2], einzelWerte[3], einzelWerte[4], einzelWerte[5], einzelWerte[6], neueMailAdresses, einzelWerte[10]);
                }

                AllContacts.addContact(neuerKontakt);
            }
        }
    }

}
