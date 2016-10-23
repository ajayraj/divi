package com.example.kenne.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Joincode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_poll);
    }
    public void back(View View)
    {
        Intent intent = new Intent(this, MakeVote.class);
        startActivity(intent);
    }

}