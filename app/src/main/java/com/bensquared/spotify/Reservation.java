package com.bensquared.spotify;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        final TextView countdown = (TextView) findViewById(R.id.CountDown);
        final TextView sesame = (TextView)findViewById(R.id.sesameStreet);
        final Button checkin= (Button) findViewById(R.id.CheckinButton);
        final Button cancel = (Button) findViewById(R.id.Cancelbutton);

        Typeface oswald = Typeface.createFromAsset(getAssets(), "Oswald-Regular.ttf");
        countdown.setTypeface(oswald);
        sesame.setTypeface(oswald);
        checkin.setTypeface(oswald);
        cancel.setTypeface(oswald);

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
    }
}
