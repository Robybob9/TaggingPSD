package com.example.robin.taggingpsd.Model;

import java.util.Date;

public class Speler {
    private String naam;
    private String voornaam;
    private Club club;
    private Date geboortedatum;
    private int id;
    private int team;
    private int rugnummer;
    private int nationaliteit;
    private String positie;

    private Actie actie;

    public Speler(String naam, String voornaam, Date geboortedatum, int team, int nationaliteit){
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = geboortedatum;
        this.team = team;
        this.nationaliteit = nationaliteit;
    }
    public int getTeam(){
        return team;
    }

    public void doAction(){

        actie.takeAction();
    }

}

