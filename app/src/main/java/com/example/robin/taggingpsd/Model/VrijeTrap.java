package com.example.robin.taggingpsd.Model;

public class VrijeTrap implements Actie {
    private Speler speler;
    private int min;

    public VrijeTrap(Speler speler, int min){
        this.speler = speler;
        this.min = min;
    }
    @Override
    public void takeAction() {

    }
}
