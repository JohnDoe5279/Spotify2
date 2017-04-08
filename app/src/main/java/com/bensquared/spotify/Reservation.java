package com.bensquared.spotify;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        final TextView countdown = (TextView) findViewById(R.id.CountDown);


            new CountDownTimer(600000, 1000) { // adjust the milli seconds here

                public void onTick(long millisUntilFinished) {
                    countdown.setText(""+String.format("%d:%d min",
                            TimeUnit.MILLISECONDS.toMinutes( millisUntilFinished),
                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                }

            public void onFinish() {
                countdown.setText("done!");
            }
        }.start();

        Button myButton = (Button)findViewById(R.id.CheckinButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(getBaseContext(), Pop.class);
                startActivity(toPop);
            }
        });
    }





}
