package com.example.robin.taggingpsd.Model;

import java.util.List;

public class Wedstrijd {
    private Team thuisteam;
    private Team uitteam;
    private String ruststand;
    private String eindstand;
    private List<Actie> acties;

    public Wedstrijd(Team thuisteam, Team uitteam){
        this.thuisteam = thuisteam;
        this.uitteam = uitteam;
    }

}
