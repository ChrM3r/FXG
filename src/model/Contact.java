package model;

import java.util.ArrayList;

public class Contact {
    private String vname;
    private String nname;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;
    private String nummer;
    private AllMailAdresses adresses;
    private String foto;

    //Konstruktor mit Foto
    public Contact(String vname, String nname, String strasse, String hausnummer, String plz, String ort, String nummer, AllMailAdresses adresses, String foto) {
        this.vname = vname;
        this.nname = nname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
        this.nummer = nummer;
        this.adresses = adresses;
        this.foto = foto;
    }
    //Konstruktor ohne Foto
    public Contact(String vname, String nname, String strasse, String hausnummer, String plz, String ort, String nummer, AllMailAdresses adresses) {
        this.vname = vname;
        this.nname = nname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
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


    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
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

    public AllMailAdresses getAdresses() {
        return adresses;
    }

    public void setAdresses(AllMailAdresses adresses) {
        this.adresses = adresses;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}

