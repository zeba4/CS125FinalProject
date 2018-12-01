package com.example.zebatabassum.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button buttonCompSci;
    private Button buttonBooks;
    private Button buttonMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonCompSci = (Button) findViewById(R.id.buttonCompSci);
        buttonCompSci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompSci();
            }
        });
        buttonBooks = (Button) findViewById(R.id.buttonBooks);
        buttonBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBooks();
            }
        });
        buttonMovies = (Button) findViewById(R.id.buttonMovies);
        buttonMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovies();
            }
        });
    }
    public void openCompSci() {
        Intent intent = new Intent(this, CompSci.class);
        startActivity(intent);
    }
    public void openBooks() {
        Intent intent = new Intent(this, Books.class);
        startActivity(intent);
    }
    public void openMovies() {
        Intent intent = new Intent(this, Movies.class);
        startActivity(intent);
    }
}
