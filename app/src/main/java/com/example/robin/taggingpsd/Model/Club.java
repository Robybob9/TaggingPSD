package com.example.robin.taggingpsd.Model;

import java.util.ArrayList;
import java.util.List;

public class Club{
    private String naam;
    private String afkorting;
    private int stamnummer;
    private int id;
    private List<Team> teams;
    private List<Speler> spelers;
    private List<Wedstrijd> wedstrijden;

    public Club(String naam, int stamnummer){
        this.naam = naam;
        this.stamnummer = stamnummer;
        this.teams = new ArrayList<>();
        this.spelers = new ArrayList<>();
        this.wedstrijden = new ArrayList<>();

    }


    public String getNaam() {
        return naam;
    }

    public int getStamnummer() {
        return stamnummer;
    }

    public int getId() {
        return id;
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }
    public void combineerSpelerTeam(){
        for(Speler speler : this.spelers){
            for(Team team : this.teams){
                if(team.getId() == speler.getTeam()){
                    team.addSpeler(speler);
                }
            }
        }
    }
    public void addSpeler(Speler speler){
        this.spelers.add(speler);
    }
    public void addWedstrijden(Wedstrijd wedstrijd){
        this.wedstrijden.add(wedstrijd);
    }




}
