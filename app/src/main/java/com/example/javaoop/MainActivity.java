package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }));

        Cat singingCat = new Cat(){
            @Override
            public void talk(){
                Log.i("talk()", "I'm singing! Бутырская тюрьма — судьба ломается. Бутырская тюрьма — душа так мается. Бутырская тюрьма — жизнь не кончается. Тюрьма стоит, столица спит, земля вращается.");
            }
        };

        singingCat.talk();

        Cat cat1 = new Cat();
        cat1.talk();
    }
}