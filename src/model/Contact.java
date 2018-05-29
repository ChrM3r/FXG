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


}

