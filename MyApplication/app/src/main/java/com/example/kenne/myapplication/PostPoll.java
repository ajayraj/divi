package com.example.kenne.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PostPoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_poll);
    }

    public void back(View view)
    {
        Intent intent1 = new Intent (this, MakeVote.class);
        startActivity(intent1);
    }

}
