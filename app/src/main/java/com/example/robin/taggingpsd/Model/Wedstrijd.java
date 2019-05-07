package com.example.robin.taggingpsd.Model;

import java.util.Date;
import java.util.List;

public class Wedstrijd {
    private String thuisclub;
    private String uitclub;
    private Date datum;
    private String Category;
    private String ruststand;
    private String eindstand;
    private List<Actie> acties;

    public Wedstrijd(String thuisclub, String uitclub, String Category){
        this.thuisclub = thuisclub;
        this.uitclub = uitclub;
        this.Category = Category;
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
    public String getCategory(){
        return Category;
    }
}
