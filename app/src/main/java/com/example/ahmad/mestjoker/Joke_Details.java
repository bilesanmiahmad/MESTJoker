package com.example.ahmad.mestjoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Joke_Details extends AppCompatActivity {
    TextView jokeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke__details);
        jokeView = (TextView) findViewById(R.id.mainJoke);
        Intent sent = getIntent();
        if (sent.hasExtra("joke")){
            JokeClass joke = (JokeClass) sent.getSerializableExtra("joke");
            jokeView.setText(joke.getJoke());

        }

    }
}
