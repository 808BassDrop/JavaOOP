package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    String name;
    protected int age;
    private String color;
    private String breed;
    public Cat(){

    }

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
