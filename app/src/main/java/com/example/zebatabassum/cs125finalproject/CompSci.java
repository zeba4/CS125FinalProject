package com.example.zebatabassum.cs125finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompSci extends AppCompatActivity {
    Button getQuestionCS;
    public static TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_sci);

        getQuestionCS = (Button) findViewById(R.id.getQuestionCS);
        data = (TextView) findViewById(R.id.questions);


        getQuestionCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getQuestion process = new getQuestion();
                process.execute();
            }
        });
    }



}
