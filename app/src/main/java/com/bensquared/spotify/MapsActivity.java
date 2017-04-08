package com.bensquared.spotify;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;


public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        getSupportActionBar().hide();

        ImageButton five = (ImageButton)findViewById(R.id.fiveanhour);
        ImageButton fourteen = (ImageButton)findViewById(R.id.fourteenanhour);
        ImageButton twenty = (ImageButton)findViewById(R.id.twentyaday);
        ImageButton fifteen = (ImageButton)findViewById(R.id.fifteenaday);

        //Does not work yet- 4/8/2017
//        five.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MapsActivity.this, popup.class));
//            }
//        });
    }

}

