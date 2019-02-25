package com.example.robin.taggingpsd.Model;

import java.util.List;

public class Team {
    private String clubnaam;
    private int id;
    private List<Wedstrijd> wedstrijden;
    private List<Speler> spelers;
    private String typePloeg;


    public Team(String clubnaam, int id, List<Wedstrijd> wedstrijden,List<Speler> spelers, String typePloeg){
        this.clubnaam = clubnaam;
        this.id = id;
        this.wedstrijden = wedstrijden;
        this.spelers = spelers;
        this.typePloeg = typePloeg;
    }

    public String getClubnaam() {
        return clubnaam;
    }

    public int getId() {
        return id;
    }

    public List<Wedstrijd> getWedstrijden() {
        return wedstrijden;
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public String getTypePloeg() {
        return typePloeg;
    }

    private void addSpeler(Speler speler){
        spelers.add(speler);
    }

    private void removeSpeler(Speler speler){
        spelers.remove(speler);
    }







}
