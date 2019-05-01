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

    public Wedstrijd(String thuisclub, String uitclub){
        this.thuisclub = thuisclub;
        this.uitclub = uitclub;

    }

    public String getThuisclub() {
        return thuisclub;
    }

    public String getUitclub() {
        return uitclub;
    }

    public void addActie(Actie a){
        acties.add(a);
    }
}
