package com.example.robin.taggingpsd.Model;

public class Kaart implements Actie{

    private String speler;
    private int minuut;
    private String soort;
    public Kaart(String speler, int minuut, String soort){
        this.speler = speler;
        this.minuut = minuut;
        this.soort = soort;
    }
    @Override
    public void takeAction() {

    }
}
