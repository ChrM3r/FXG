package model;

import java.util.ArrayList;

public class AllMailAdresses {


    private ArrayList<MailAdress> allMailAdresses;

    public AllMailAdresses(ArrayList<MailAdress> adresses){
        this.allMailAdresses = adresses;
    }
        public ArrayList<MailAdress> getAllMailAdresses(){
            return this.allMailAdresses;
        }

}

