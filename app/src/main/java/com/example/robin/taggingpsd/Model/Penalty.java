package com.example.robin.taggingpsd.Model;

public class Penalty implements Actie {
    private Speler speler;
    private int minuut;

    public Penalty(Speler speler, int minuut){
        this.speler = speler;
        this.minuut = minuut;
    }
    @Override
    public void takeAction() {

    }
}
