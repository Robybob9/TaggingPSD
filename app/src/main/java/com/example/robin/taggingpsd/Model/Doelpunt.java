package com.example.robin.taggingpsd.Model;

public class Doelpunt implements Actie{
    private Speler speler;
    private int minuut;
    private String soort;

    public Doelpunt(Speler speler, int minuut, String soort){
        this.speler = speler;
        this.minuut = minuut;
        this.soort = soort;
    }

    @Override
    public void takeAction() {

    }
}
