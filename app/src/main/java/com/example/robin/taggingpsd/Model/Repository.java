package com.example.robin.taggingpsd.Model;

import android.annotation.TargetApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository {
    private Club club;
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/TaggingPSD?user=root&password=Robin001";

    public Repository() {
        this.club = new Club("RSC Anderlecht", 35);
    }

    @TargetApi(19)
    public void voegAllesToe() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL)) {
            PreparedStatement query = conn.prepareStatement("select naam, voornaam, geboortedatum, team, nationaliteit from PSD.members where status = 'speler' and club = 1");

            try (ResultSet rs = query.executeQuery()) {
                while(rs.next()){
                    Speler speler = new Speler(rs.getString("naam"),rs.getString("voornaam"),rs.getDate("geboortedatum"),rs.getInt("team"),rs.getInt("nationaliteit"));
                    this.club.addSpeler(speler);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            PreparedStatement query2 = conn.prepareStatement("select id, naam, geslacht from teams");

            try (ResultSet rs = query.executeQuery()) {
                while(rs.next()){
                    Team team = new Team(rs.getInt("id"),rs.getString("naam"),rs.getString("geslacht"));
                    this.club.addTeam(team);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            PreparedStatement query3 = conn.prepareStatement("select team,c.naam as thuisploeg,ci.naam as uitploeg,datum from wedstrijden join clubs as c on wedstrijden.thuisclub = c.id join clubs as ci on wedstrijden.bezoekersclub = ci.id where thuisclub = 1 or bezoekersclub = 1");

            try (ResultSet rs = query.executeQuery()) {
                while(rs.next()){
                    Wedstrijd wedstrijd = new Wedstrijd(rs.getString("thuisploeg"),rs.getString("uitploeg"),rs.getInt("id"),rs.getDate("datum"));
                    this.club.addWedstrijden(wedstrijd);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
