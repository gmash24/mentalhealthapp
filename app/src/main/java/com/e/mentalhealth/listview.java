package com.e.mentalhealth;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        listview();

    }
    public void listview(){
        //cresting an adapter for the listview
        ArrayAdapter<String> adapter=  new ArrayAdapter<String>(this,R.layout.listdata,NAMES);

        //linking the adapter to the created listview in layout
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick ( AdapterView<?> parent, View view, int position, long id ) {
                String value= (String) listView.getItemAtPosition(position);
                Toast.makeText(listview.this, "Position : " + position + "Value : "+ value, Toast.LENGTH_SHORT).show();


            }
        });

    }
}