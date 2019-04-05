package com.example.robin.taggingpsd.Model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int id;
    private List<Wedstrijd> wedstrijden;
    private List<Speler> spelers;
    private String typePloeg;
    private String geslacht;


    public Team(int id, String typePloeg, String geslacht){
        this.geslacht = geslacht;
        this.id = id;
        this.wedstrijden = new ArrayList<>();
        this.spelers = new ArrayList<>();
        this.typePloeg = typePloeg;
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

    public void addSpeler(Speler speler){
        spelers.add(speler);
    }

    private void removeSpeler(Speler speler){
        spelers.remove(speler);
    }







}
