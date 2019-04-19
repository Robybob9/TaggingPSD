package com.example.robin.taggingpsd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.robin.taggingpsd.Model.Actie;
import com.example.robin.taggingpsd.Model.Kaart;
import com.example.robin.taggingpsd.Model.Speler;
import com.example.robin.taggingpsd.Model.Timer;
import com.example.robin.taggingpsd.R;

import java.util.List;
import java.util.TimerTask;

public class Scorebord extends Activity {


    private com.example.robin.taggingpsd.Model.Timer timer;
    private java.util.Timer timerClass;
    private TextView klok;
    private Button start;
    private Button Gele;
    private MytimerTask mytimerTask;
    public Scorebord(){
        timerClass = new java.util.Timer();
        mytimerTask = new MytimerTask();
    }

    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorbord);
        start = findViewById(R.id.startmatch);
        Gele = findViewById(R.id.gele_kaart);
        Gele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String naam = "";
                Actie gele = new Kaart(naam,Integer.parseInt(timer.getTime().split(":")[0]),"geel");

            }
        });
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
