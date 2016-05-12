package com.example.user.poly_glot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Which_language_u_like_to_learn extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_which_language_u_like_to_learn);
    }


    public void Sinhala (View view){
        Intent intent = new Intent(this ,MainActivity2ActivitySinhala.class);
        startActivity(intent);
    }
}
