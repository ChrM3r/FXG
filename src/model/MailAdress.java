package model;

public class MailAdress {


    private String adresse;


    public MailAdress(String adresse) {
        this.adresse = (adresse.contains("@") && adresse.charAt(0) != '@' && adresse.charAt(adresse.length() - 1) != '@' && adresse.length() >= 3) ? adresse : null;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        return adresse;
    }
}
