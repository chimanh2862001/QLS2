package com.example.quanlysach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import SQL.MySQL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySQL mySQL=new MySQL(this);
    }
}