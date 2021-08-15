package com.e.mentalhealth;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class home extends AppCompatActivity {
    CardView cardview;
    Button arrow;
    ConstraintLayout expandview;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        expandview=findViewById(R.id.expandableView);
        arrow=findViewById(R.id.arrowBtn);
        cardview=findViewById(R.id.cardView);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                if(expandview.getVisibility()==View.GONE)
                {
                    TransitionManager.beginDelayedTransition(cardview, new AutoTransition());
                    expandview.setVisibility(View.VISIBLE);
                    arrow.setBackgroundResource(R.drawable.ic_up);
            }else{
                    TransitionManager.beginDelayedTransition(cardview, new AutoTransition());
                    expandview.setVisibility(View.GONE);
                    arrow.setBackgroundResource(R.drawable.ic_down);
                }
        }


    });
}}