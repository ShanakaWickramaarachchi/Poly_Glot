package com.example.user.poly_glot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity2ActivitySinhala extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_activity_sinhala);
    }

    public void xxx (View view){
        Intent intent = new Intent(this ,Nice_to_meet_u.class);
        startActivity(intent);
    }

    public void xxz (View view){
        Intent intent = new Intent(this ,About_me_1.class);
        startActivity(intent);
    }

    public void xxy (View view){
        Intent intent = new Intent(this ,Feelings_1.class);
        startActivity(intent);
    }

}
