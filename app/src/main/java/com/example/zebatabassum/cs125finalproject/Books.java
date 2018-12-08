package com.example.zebatabassum.cs125finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//ANIMALS!!!!!
public class Books extends AppCompatActivity {
    Button getQuestionCS;
    Button answerCS;
    //    Button answerCS;
    public static TextView data;
    public static TextView dataAnswers;
    //public static TextView dataAnswer;
//    String dataCS = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        getQuestionCS = (Button) findViewById(R.id.getQuestionCS);
        answerCS = (Button) findViewById(R.id.answerCS);
        data = (TextView) findViewById(R.id.questions);
        dataAnswers = (TextView) findViewById(R.id.answers);
//        answerCS = (Button) findViewById(R.id.answerCS);
//        dataAnswer = (TextView) findViewById(R.id.answers);


        getQuestionCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.answers);
                textView.setVisibility(View.INVISIBLE);
                getQuestionMusic process = new getQuestionMusic();
                process.execute();
            }
        });

        answerCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.answers);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }





}

