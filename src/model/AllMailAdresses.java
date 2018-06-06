package model;

import java.util.ArrayList;

public class AllMailAdresses {


    private ArrayList<MailAdress> allMailAdresses = new ArrayList<>();

    public AllMailAdresses(ArrayList<MailAdress> adresses){
        this.allMailAdresses = adresses;
    }

        public void addMailAdress (MailAdress adress){
            this.allMailAdresses.add(adress);
        }

        public void clear(){
            this.allMailAdresses.clear();
        }

        public ArrayList<MailAdress> getAllMailAdresses(){
            return this.allMailAdresses;
        }

}

