package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    String name;
    private int age;
    final static int numberOfLegs = 4;
    static int count = 0;
    String helloText;
    CatMood catMood;



    class CatMood{
        int levelOfMood;

        CatMood(){
            if(Cat.this.age < 2){
                levelOfMood = 100;
            }
            else if (Cat.this.age >= 2 && Cat.this.age < 7){
                levelOfMood = 50;
            }
            else if (Cat.this.age >= 7){
                levelOfMood = 20;
            }
        }
    }

    public Cat(){
        count++;
        this.name = "Transformator";
        this.age = -1;

        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:{
                helloText = "Meow! I'm happy cat :3 My name is " + name + " and I'm " + age + " years old!";
                break;
            }
            case 50:{
                helloText = "Meow! I'm cat. My name is " + name + " and I'm " + age + " years old!";
            }
            case 20:{
                helloText = "Meow! I'm old cat. My name is " + name + " and I'm " + age + " years old!";
            }
        }
    }

    public Cat(int age, String name){
        count++;
        this.age = age;
        this.name = name;

        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:{
                helloText = "Meow! I'm happy cat :3 My name is " + name + " and I'm " + age + " years old!";
                break;
            }
            case 50:{
                helloText = "Meow! I'm cat. My name is " + name + " and I'm " + age + " years old!";
            }
            case 20:{
                helloText = "Meow! I'm old cat. My name is " + name + " and I'm " + age + " years old!";
            }
        }
    }

    public void talk(){
        Log.i("talk()", helloText);
    }
    public void talk(int age){
        Log.i("talk()", "Meow! I'm " + age + " years old!");
    }
    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }
    public static String whatCatsLike(){
        return " I like playing, jumping and sometimes scratching";
    }
}
