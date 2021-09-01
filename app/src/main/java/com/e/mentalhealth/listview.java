package com.e.mentalhealth;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listview extends AppCompatActivity {


    private  static ListView listView;
    private static String[]NAMES=new String[]{
            "Gift","Nyanje","Masha","Madu"
    };

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listview);




        // Enables Always-on

    }
}