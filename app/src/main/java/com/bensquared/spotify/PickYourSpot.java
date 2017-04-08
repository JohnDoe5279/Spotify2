package com.bensquared.spotify;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PickYourSpot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_your_spot);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



            }
        });

        Button reserve = (Button)findViewById(R.id.reserveButton);
        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toReserve = new Intent(getBaseContext(), Reservation.class);
                startActivity(toReserve);
            }
        });



        ImageButton spot1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton spot2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton spot3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton spot4 = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton spot5 = (ImageButton)findViewById(R.id.imageButton5);


        spot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton spot1 = (ImageButton)findViewById(R.id.imageButton1);
                spot1.setImageResource(R.drawable.spotred);

            }
        });
        spot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton spot2 = (ImageButton)findViewById(R.id.imageButton2);
                spot2.setImageResource(R.drawable.spotred);
            }
        });
        spot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton spot3 = (ImageButton)findViewById(R.id.imageButton3);
                spot3.setImageResource(R.drawable.spotred);
            }
        });
        spot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton spot4 = (ImageButton)findViewById(R.id.imageButton4);
                spot4.setImageResource(R.drawable.spotred);
            }
        });
        spot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton spot5 = (ImageButton)findViewById(R.id.imageButton5);
                spot5.setImageResource(R.drawable.spotred);
            }
        });
    }

}
