package com.bensquared.spotify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
       final TextView time = (TextView)findViewById(R.id.mySpotTime);
        TextView total = (TextView)findViewById(R.id.TotalPrice);

        rate.setText("Rate                           $  6 hourly");

        
//        CountUpTimer timer = new CountUpTimer(1000) {
//            public void onTick(int second) {
//                time.setText("Time                           x  "+String.format("%d:%d min",
//                        TimeUnit.SECONDS.toMinutes(second),
//                                second));
//            }
//        };
//
//        timer.start();

    }
}
