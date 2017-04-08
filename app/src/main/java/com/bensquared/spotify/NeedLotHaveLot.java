package com.bensquared.spotify;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class NeedLotHaveLot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_lot_have_lot);

        TextView needASpot = (TextView)findViewById(R.id.needASpot);
        Button haveALot = (Button)findViewById(R.id.haveALot);


        Typeface oswald = Typeface.createFromAsset(getAssets(), "Oswald-Regular.ttf");
        haveALot.setTypeface(oswald);
        needASpot.setTypeface(oswald);


        haveALot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMapActivity = new Intent(getBaseContext(), MapsActivity.class);

                startActivity(toMapActivity);
            }
        });

        needASpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNav = new Intent(getBaseContext(), MySpot.class);
                startActivity(toNav);

            }
        });
    }
}
