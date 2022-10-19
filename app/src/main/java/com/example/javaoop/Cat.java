package com.example.javaoop;

import android.util.Log;

public class Cat {
    String name;
    int age;
    String color;
    String breed;

    public Cat(int age, String name, String color, String breed){
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public void talk(){
        Log.i("talk()", "Hi! My name is " + name + " and I'm " + age + " years old!" + " My breed is " + breed + " and color is " + color);
    }
}
