package com.example.ahmad.mestjoker;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {
    private final long SPLASH_TIME = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Screen.this, JokeList.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME);
    }
}
