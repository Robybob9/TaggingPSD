package com.example.robin.taggingpsd.Model;

import java.util.Date;
import java.util.List;

public class Wedstrijd {
    private String thuisclub;
    private String uitclub;
    private Date datum;
    private int team;
    private String ruststand;
    private String eindstand;
    private List<Actie> acties;

    public Wedstrijd(String thuisclub, String uitclub, int team, Date datum){
        this.thuisclub = thuisclub;
        this.uitclub = uitclub;
        this.team = team;
        this.datum = datum;
    }

}
