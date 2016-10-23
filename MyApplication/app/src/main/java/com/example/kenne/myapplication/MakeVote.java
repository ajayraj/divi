package com.example.kenne.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MakeVote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_vote);
    }
    public void join(View view)
    {
        Intent intent = new Intent(this, Joincode.class);
        startActivity(intent);
    }
    public void create(View view)
    {
        Intent intent = new Intent(this, CreatePoll.class);
        startActivity(intent);
    }
    public void end(View View)
    {
        Intent intent = new Intent(this, SecureFinger.class);
        startActivity(intent);
    }
}

