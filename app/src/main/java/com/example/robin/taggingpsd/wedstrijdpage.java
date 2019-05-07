package com.example.robin.taggingpsd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.robin.taggingpsd.Model.Repository;
import com.example.robin.taggingpsd.Model.Wedstrijd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class wedstrijdpage extends Activity {

    private List<Wedstrijd> wedstrijden;
    private List<Button> buttons;
    private Repository rep;
    private LinearLayout linlay;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wedstrijdpage);
        rep = new Repository();
        linlay = findViewById(R.id.linlay2);
        buttons = new ArrayList<>();
        wedstrijden = rep.haalWedstrijdenOp(getIntent().getStringExtra("teamnaam"),"u21");
        for (Wedstrijd w : wedstrijden) {
            Button b = new Button(this);
            buttons.add(b);
            b.setText(w.getThuisclub() + "-" + w.getUitclub());
            linlay.addView(b);
        }
        for (Button b : buttons) {
            final String text = (String) b.getText();
            b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(wedstrijdpage.this, Scorebord.class);
                    for(Wedstrijd w : wedstrijden){
                        if(w.getThuisclub() + "-" + w.getUitclub() == text)
                            intent.putExtra("wedstrijd",(Serializable) w);
                    }
                    intent.putExtra("teamnamen", text);
                    startActivity(intent);
                }
            });

        }
    }
}
