package com.example.ahmad.mestjoker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText title = (EditText) findViewById(R.id.title);
        EditText new_joke = (EditText) findViewById(R.id.txtJoke);

        Button btn_add = (Button) findViewById(R.id.add);
    }
}
