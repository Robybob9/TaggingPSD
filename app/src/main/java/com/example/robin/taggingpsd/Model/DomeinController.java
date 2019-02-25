package com.example.robin.taggingpsd.Model;

public class DomeinController {

    private Club club;

    public DomeinController(Club club){

        this.club = club;
    }

    public void takeAction(int id){
        club.getSpeler(id); //.takeAction();
    }


}
