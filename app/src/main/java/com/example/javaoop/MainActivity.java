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
        Schizo.talk();

        Puma Messi = new Puma();
        Messi.talk();

        Cat puma = new Puma();
        puma.talk();

        Cat cargoTrain = new Lion();
        cargoTrain.talk();
    }
}