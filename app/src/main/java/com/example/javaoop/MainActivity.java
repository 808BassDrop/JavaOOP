package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat Schizo = new Cat();
        Schizo.talk(3);
        Schizo.talk("I love peppermints and committing war crimes!");
    }
}