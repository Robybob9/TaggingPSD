package com.example.robin.taggingpsd.Model;

import java.util.List;

public class Club{
    private String naam;
    private String afkorting;
    private int stamnummer;
    private int id;
    private List<Team> teams;

    public String getNaam() {
        return naam;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public int getStamnummer() {
        return stamnummer;
    }

    public int getId() {
        return id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Speler getSpeler(int id){

        return null;
    }


}
