package com.agustinbergomi.recycler4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("asd");
        wordList.add("asd");
        wordList.add("asd");
        wordList.add("asd");
        wordList.add("asd");
        wordList.add("asd");
        wordList.add("asd");
    }
}