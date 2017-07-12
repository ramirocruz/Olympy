package com.example.rish.androidapp;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import android.widget.Toast;


public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    public void click1(View view){

        startActivity(new Intent(getApplicationContext(),Paper1.class));

    }

    public void click2(View view){

        startActivity(new Intent(getApplicationContext(),Paper2.class));

    }

    public void click3(View view){
        startActivity(new Intent(getApplicationContext(),Paper3.class));

    }


}
