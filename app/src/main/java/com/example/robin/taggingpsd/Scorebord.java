package com.example.robin.taggingpsd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.robin.taggingpsd.Model.Actie;
import com.example.robin.taggingpsd.Model.Doelpunt;
import com.example.robin.taggingpsd.Model.Kaart;
import com.example.robin.taggingpsd.Model.Penalty;
import com.example.robin.taggingpsd.Model.Repository;
import com.example.robin.taggingpsd.Model.Speler;
import com.example.robin.taggingpsd.Model.Team;
import com.example.robin.taggingpsd.Model.Timer;
import com.example.robin.taggingpsd.Model.VrijeTrap;
import com.example.robin.taggingpsd.Model.Wedstrijd;
import com.example.robin.taggingpsd.R;

import java.util.List;
import java.util.TimerTask;

public class Scorebord extends Activity {


    private com.example.robin.taggingpsd.Model.Timer timer;
    private java.util.Timer timerClass;
    private Team thuisteam;
    private Team uitteam;
    private TextView klok;
    private Button start;
    private Button Gele;
    private Button Rode;
    private Button doelpunt;
    private Button vrijeTrap;
    private Button penalty;
    private TextView wedstrijdteams;
    private List<Speler> thuisSpelers;
    private List<Speler> uitSpelers;
    private Wedstrijd wedstrijd;
    private Repository rep;
    private MytimerTask mytimerTask;


    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorbord);
        timerClass = new java.util.Timer();
        mytimerTask = new MytimerTask();
        start = findViewById(R.id.startmatch);
        Gele = findViewById(R.id.gele_kaart);
        Rode = findViewById(R.id.rode_kaart);
        doelpunt = findViewById(R.id.doelpunt);
        vrijeTrap = findViewById(R.id.vrijeTrap);
        penalty = findViewById(R.id.penalty);
        wedstrijdteams = findViewById(R.id.wedstrijd);
        rep = new Repository();

        wedstrijd = (Wedstrijd) getIntent().getSerializableExtra("wedstrijd");
        thuisSpelers = rep.haalSpelersOp(wedstrijd.getThuisclub(),wedstrijd.getCategory());

        Gele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Speler naam = null;
                Actie gele = new Kaart(naam,Integer.parseInt(timer.getTime().split(":")[0]),"geel");
                wedstrijd.addActie(gele);
            }
        });
        Rode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Speler naam = null;
                Actie rode = new Kaart(naam,Integer.parseInt(timer.getTime().split(":")[0]),"rood");
                wedstrijd.addActie(rode);
            }
        });
        doelpunt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Speler naam = null;
                Actie doelpunt = new Doelpunt(naam,Integer.parseInt(timer.getTime().split(":")[0]),"geel");
                wedstrijd.addActie(doelpunt);
            }
        });
        penalty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Speler naam = null;
                Actie penalty = new Penalty(naam,Integer.parseInt(timer.getTime().split(":")[0]));
                wedstrijd.addActie(penalty);
            }
        });
        vrijeTrap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Speler naam = null;
                Actie vrijetrap = new VrijeTrap(naam,Integer.parseInt(timer.getTime().split(":")[0]));
                wedstrijd.addActie(vrijetrap);
            }
        });
        wedstrijdteams.setText(getIntent().getStringExtra("teamnamen"));
        klok = findViewById(R.id.klok);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                timer = new Timer();
                timerClass.schedule(mytimerTask,1000,1000);
            }
        });




    }
    class MytimerTask extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    klok.setText(timer.getTime());
                }
            });
        }
    }
}
