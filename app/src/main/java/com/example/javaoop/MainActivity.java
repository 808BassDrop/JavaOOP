package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat transfomator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transfomator = new Cat(10, "Transformator", "grey with stripes", "street cat");
        transfomator.talk();
        transfomator.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(transfomator.numberOfLegs));
        transfomator.breathe();

        Puma floppa = new Puma();
        floppa.breathe();
        floppa.talk();
        floppa.isAlive = true;
        floppa.name = "Big Floppa";
        Log.i("isAlive", String.valueOf(floppa.isAlive));
        Log.i("breathe()", "My name is " + floppa.name + " and " + floppa.breathe());
    }
}