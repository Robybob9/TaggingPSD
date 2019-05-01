package com.example.robin.taggingpsd.Model;

import android.annotation.TargetApi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {


    public List<String> haalTeamsOp(Club club) {
        List<String> teams = Arrays.asList("Eerste ploeg","reserven","u21 nationaal","u19 nationaal","u17 nationaal","u15 nationaal", "u13 nationaal", "u11 nationaal", "u10 nationaal");
        return teams;
    }
    @TargetApi(26)
    public List<Wedstrijd> haalWedstrijdenOp(String teamnaam){
        List<Wedstrijd> wedstrijden = Arrays.asList(new Wedstrijd("Fc Galmaarden","KRC Genk"),new Wedstrijd("Club Brugge","Fc Galmaarden"),new Wedstrijd("Fc Galmaarden","Afc Tubize"),new Wedstrijd("KRC Genk","Fc Galmaarden"),new Wedstrijd("Fc Galmaarden","Club brugge"),new Wedstrijd("AFC Tubize","FC Galmaarden"));
        return wedstrijden;
    }
}
