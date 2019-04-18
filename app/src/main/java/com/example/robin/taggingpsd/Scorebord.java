package com.example.robin.taggingpsd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.robin.taggingpsd.Model.Actie;
import com.example.robin.taggingpsd.Model.Kaart;
import com.example.robin.taggingpsd.Model.Speler;
import com.example.robin.taggingpsd.Model.Timer;
import com.example.robin.taggingpsd.R;

import java.util.List;

public class Scorebord extends Activity {


    private com.example.robin.taggingpsd.Model.Timer timer;

    public Scorebord(){


    }

    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorbord);
        timer = new Timer();
        Button Gele = findViewById(R.id.gele_kaart);
        Gele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String naam = "";
                Actie gele = new Kaart(naam,Integer.parseInt(timer.getTime().split(":")[0]),"geel");
            }
        });
        TextView klok = findViewById(R.id.textView3);
        while(timer.getTime() != "45:00")
            klok.setText(timer.getTime());


    }
}
