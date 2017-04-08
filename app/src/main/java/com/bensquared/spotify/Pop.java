package com.bensquared.spotify;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ben on 4/8/2017.
 */

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow3);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        double width = dm.widthPixels;
        double height = dm.heightPixels;

        getWindow().setLayout((int)(width/1.5), (int)(height/4));

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button confirmButton = (Button)findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMySpot = new Intent(getBaseContext(), MySpot.class);
                startActivity(toMySpot);
            }
        });


    }
}
