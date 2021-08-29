package com.e.mentalhealth;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class dashboard extends AppCompatActivity {
private DrawerLayout mdrawerlayout;
private ActionBarDrawerToggle mtoggle;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mdrawerlayout= findViewById(R.id.drawer);
         mtoggle= new ActionBarDrawerToggle(this, mdrawerlayout,R.string.open,R.string.close);
         mdrawerlayout.addDrawerListener(mtoggle);
         mtoggle.syncState();
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected ( @NonNull MenuItem item ) {
       if (mtoggle.onOptionsItemSelected(item)){
           return true;
       }

        return super.onOptionsItemSelected(item);

    }
}