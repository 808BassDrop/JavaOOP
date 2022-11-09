package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    String name;
    int age;

    public Cat(){

    }

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void talk(){
        Log.i("talk()", "Meow! My name is " + name + " and I'm " + age + " years old!");
    }
    public void talk(int age){
        Log.i("talk()", "Meow! I'm " + age + " years old!");
    }
    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }
}
