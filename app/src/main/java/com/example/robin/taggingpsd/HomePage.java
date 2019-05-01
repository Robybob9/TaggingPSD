package com.example.robin.taggingpsd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.robin.taggingpsd.Model.Club;
import com.example.robin.taggingpsd.Model.Repository;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Activity {
    private Club club;
    private List<String> teams;
    private Repository rep;
    private LinearLayout linlay;
    private List<Button> buttons;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        rep = new Repository();
        club = new Club("RSC Anderlecht", 35);
        teams = rep.haalTeamsOp(club);
        linlay = findViewById(R.id.linlay2);
        buttons = new ArrayList<>();
        for(String team : teams){
            Button b = new Button(this);
            buttons.add(b);
            b.setText(team);
            linlay.addView(b);
        }
        for(Button b : buttons){
            final String text = (String) b.getText();
            b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(HomePage.this, wedstrijdpage.class);
                    intent.putExtra("teamnaam",text);
                    startActivity(intent);
                }
            });
        }
        }

    }

