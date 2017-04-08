package com.bensquared.spotify;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class MapsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //POP UP WINDOW Portion.  Need to inflate it while on the map page.
        //################################################################
//        final ImageButton btnOpenPopup = (ImageButton)findViewById(R.id.fiveanhour);
//        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){
//
//            @Override
//            public void onClick(View arg0) {
//                LayoutInflater layoutInflater
//                        = (LayoutInflater)getBaseContext()
//                        .getSystemService(LAYOUT_INFLATER_SERVICE);
//                View popupView = layoutInflater.inflate(R.layout.popupwindow, null);
//                final PopupWindow popupWindow = new PopupWindow(
//                        popupView,
//                        ViewGroup.LayoutParams.WRAP_CONTENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT);
//
//                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
//                btnDismiss.setOnClickListener(new Button.OnClickListener(){
//
//                    @Override
//                    public void onClick(View v) {
//                        // TODO Auto-generated method stub
//                        popupWindow.dismiss();
//                    }});
//
//                popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
//
//            }});

        ImageButton priceTag1 = (ImageButton)findViewById(R.id.fifteenaday);
        ImageButton priceTag2 = (ImageButton)findViewById(R.id.fourteenanhour);
        ImageButton priceTag3 = (ImageButton)findViewById(R.id.fiveanhour);

        priceTag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(getBaseContext(), Pop2.class);
                startActivity(toPop);

            }
        });
        priceTag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(getBaseContext(), Pop2.class);
                startActivity(toPop);

            }
        });
        priceTag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(getBaseContext(), Pop2.class);
                startActivity(toPop);

            }
        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // Not sure if will work with android.app
        android.app.FragmentManager fragmentManager = getFragmentManager();


        if (id == R.id.nav_first_layout) {
            Intent toDataActivity = new Intent(getBaseContext(), Data.class);
            startActivity(toDataActivity);
        } else if (id == R.id.nav_second_layout) {
            Intent reserveIntent = new Intent(getBaseContext(), Reservation.class);
            startActivity(reserveIntent);

        } else if (id == R.id.nav_third_layout) {

        } else if (id == R.id.nav_share) {

        }  else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}