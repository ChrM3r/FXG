package model;

import java.util.ArrayList;

public class Contact {
    private String vname;
    private String nname;
    private String strasse;
    private String plz;
    private String ort;
    private String nummer;
    private ArrayList<MailAdress> adresses;
    private String foto;

    //Konstruktor mit Foto
    public Contact(String vname, String nname, String strasse, String plz, String ort, String nummer, ArrayList<MailAdress> adresses, String foto) {
        this.vname = vname;
        this.nname = nname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.nummer = nummer;
        this.adresses = adresses;
        this.foto = foto;
    }
    //Konstruktor ohne Foto
    public Contact(String vname, String nname, String strasse, String plz, String ort, String nummer, ArrayList<MailAdress> adresses) {
        this.vname = vname;
        this.nname = nname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.nummer = nummer;
        this.adresses = adresses;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public ArrayList<MailAdress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<MailAdress> adresses) {
        this.adresses = adresses;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    static public ArrayList<Contact> getDefaultContacts(){

        ArrayList<MailAdress> merscherAdresses = new ArrayList<>();
        merscherAdresses.add(new MailAdress("chris.merscher@beuth-hochschule.de"));
        merscherAdresses.add(new MailAdress("chris.merscher@web.de"));

        ArrayList<MailAdress> mustermannAdresses = new ArrayList<>();
        merscherAdresses.add(new MailAdress("max.mustermann@beuth-hochschule.de"));
        merscherAdresses.add(new MailAdress("max.mustermann@web.de"));

        ArrayList<MailAdress> testAdresses = new ArrayList<>();
        merscherAdresses.add(new MailAdress("test.test@beuth-hochschule.de"));
        merscherAdresses.add(new MailAdress("test.test@web.de"));

        ArrayList<Contact> defaultContacts = new ArrayList<>();
        defaultContacts.add(new Contact("Chris", "Merscher", "Teststraße 10", "02347", "Teststadt", "01560286537", merscherAdresses, "merscher.jpg"));
        defaultContacts.add(new Contact("Max", "Mustermann", "Musterstraße 10", "12345", "Musterstadt", "01230987654", mustermannAdresses, "mustermann.jpg"));
        defaultContacts.add(new Contact("Test", "Testname", "Testerweg 34", "90765", "Testdorf", "09537219343", testAdresses, "testname.jpg"));


        return defaultContacts;
    }
}

