package com.example.kenne.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreatePoll extends AppCompatActivity
{
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_poll);

        database = FirebaseDatabase.getInstance();

        /*myRef = database.getReference("message");

        myRef.setValue("Poll Options");*/
    }
    public void back(View view)
    {
        Intent intent2 = new Intent(this, MakeVote.class);
        startActivity(intent2);
    }
    public void get_input(View view)
    {
        EditText Choice1=(EditText)findViewById(R.id.option_input1);
        EditText Choice2=(EditText)findViewById(R.id.option_input2);
        EditText Choice3=(EditText)findViewById(R.id.option_input3);
        EditText Choice4=(EditText)findViewById(R.id.option_input4);
        EditText Choice5=(EditText)findViewById(R.id.option_input5);
        EditText Question = (EditText) findViewById(R.id.question_text);


        String C1 = Choice1.getText().toString();
        String C2 = Choice2.getText().toString();
        String C3 = Choice3.getText().toString();
        String C4 = Choice4.getText().toString();
        String C5 = Choice5.getText().toString();
        String Q = Question.getText().toString();


        myRef = database.getReference("Poll");
        myRef.child(C1).child("Votes").setValue(0);
        myRef.child(C2).child("Votes").setValue(0);
        myRef.child(C3).child("Votes").setValue(0);
        myRef.child(C4).child("Votes").setValue(0);
        myRef.child(C5).child("Votes").setValue(0);


    }
}
