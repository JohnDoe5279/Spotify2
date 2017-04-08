package com.bensquared.spotify;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

/**
 * Created by scrubster on 4/8/2017.
 */

public class MySpot extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myspot);

        TextView rate = (TextView)findViewById(R.id.mySpotRatte);
       final Chronometer time = (Chronometer)findViewById(R.id.mySpotTime);
        TextView total = (TextView)findViewById(R.id.TotalPrice);
        TextView sesame = (TextView)findViewById(R.id.sesameStreetMySpot);
        Button checkout = (Button)findViewById(R.id.Checkout);


        Typeface oswald = Typeface.createFromAsset(getAssets(), "Oswald-Regular.ttf");

        time.setTypeface(oswald);
        rate.setTypeface(oswald);
        total.setTypeface(oswald);
        sesame.setTypeface(oswald);
        checkout.setTypeface(oswald);

        time.start();



    }
}
