package com.example.ahmad.mestjoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class JokeList extends AppCompatActivity {
    ArrayList<JokeClass> jokelist = new ArrayList<JokeClass>();
    ListView jokeView;
    ArrayAdapter<JokeClass> adapter;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_list);
        jokeView = (ListView) findViewById(R.id.list_joke);
        btnAdd = (Button) findViewById(R.id.btnAddJoke);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        jokelist.add(new JokeClass("Walks into a Bar", "A man walked into a Florida bar with his alligator and asked the bartender: \"Do you serve lawyers here?\" \"Sure.\" \"Good. One beer for me and a lawyer for my alligator.\" \n" +
                "\n" +
                "source: http://www.jokes4us.com/animaljokes/alligatorjokes.html"));

        jokelist.add(new JokeClass("Double Dare", "One day, a very rich man announced in a party that if any person present in the party dares to swim across the swimming pool which has more than twenty crocodiles, he will be awarded with either half of the rich man's property or his beautiful daughter. After a period of silence, the rich man saw a young man splashed into the pool swimming as fast as he can, with all his efforts, saving himself from the crocodiles. And at last, he survived through the pool. Everybody started clapping. The rich man was overjoyed with the young man's bravery. He congratulated him and then asked what do you want, my property or daughter. To this, the man replied, \"Sir, neither I want your property, nor your daughter, I just want the man who threw me in the water.\" \n" +
                "\n" +
                "source: http://www.jokes4us.com/animaljokes/alligatorjokes.html"));
        jokelist.add(new JokeClass("Army Training","At an army training camp in Florida, the Seargent is giving a talk: \"The main quality we look for in this army is commitment and this is what I call commitment.\" An alligator came in the room and bit the seargents penis. It stayed there for about a 10 seconds then the seargent poked it in the eyes and kicked it off. \"Now who's ready to show their commitment?\" said the Seargent. A man put his hand up and said \"I will, but promise you won't poke me in the eyes.\" \n" +
                "\n" +
                "source: http://www.jokes4us.com/animaljokes/alligatorjokes.html"));
        adapter = new ArrayAdapter<JokeClass>(this, android.R.layout.simple_list_item_1, jokelist);
        jokeView.setAdapter(adapter);
        jokeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                JokeClass joke = jokelist.get(position);
                Intent intent = new Intent(getBaseContext(), Joke_Details.class);
                intent.putExtra("joke", joke);
                startActivity(intent);
            }
        });
    }
}
