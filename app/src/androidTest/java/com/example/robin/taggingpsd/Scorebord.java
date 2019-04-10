package com.example.robin.taggingpsd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.robin.taggingpsd.Model.Actie;

public class Scorebord extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Button Gele = findViewById(R.id.gele_kaart);
        Gele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Actie gele = new Kaart(speler, minuut, "geel");
            }
        });

        setContentView(R.layout.scorbord);
    }
}
