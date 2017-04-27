package com.example.ahmad.mestjoker;

import java.io.Serializable;

/**
 * Created by ahmad on 4/27/17.
 */

public class JokeClass implements Serializable{

    private String Title;
    private String Joke;

    public JokeClass(String title, String joke) {
        Title = title;
        Joke = joke;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getJoke() {
        return Joke;
    }

    public void setJoke(String joke) {
        Joke = joke;
    }

    @Override
    public String toString() {
        return Title;
    }
}
