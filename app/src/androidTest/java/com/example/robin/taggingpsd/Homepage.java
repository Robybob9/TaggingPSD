package com.example.robin.taggingpsd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.robin.taggingpsd.Model.Club;
import com.example.robin.taggingpsd.Model.Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity {

    List<Team> teams = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {

            // SET CONNECTIONSTRING

            Connection DbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TaggingPSD?user=root&password=Robin001");

            Log.w("Connection", "open");
            PreparedStatement query = DbConn.prepareStatement(" select naam FROM psd.teams WHERE geslacht = 'mannen'");

            try (ResultSet rs = query.executeQuery()) {
                if (rs.next()) {
                    String naam = rs.getString("naam");


                    DbConn.close();
                }
            } catch (Exception e) {
                Log.w("Error connection", "" + e.getMessage());
            }

            setContentView(R.layout.homepage);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

