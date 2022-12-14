package com.example.javaoop;

import android.util.Log;

public abstract class Cat extends Animal {
    String name;
    private int age;
    final static int numberOfLegs = 4;
    static int count = 0;



    String helloText;
    CatMood catMood;

    static class CountResetter{
        boolean moreThan100;

        CountResetter(){
            if(Cat.count > 5){
                moreThan100 = true;
            }
            if (moreThan100){
                resetCount(0);
            }
        }

        void resetCount(int value){
            Cat.count = value;
        }
    }

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

    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;

            }

            String mouseVoice() {
                return "AAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            }
        }

        Mouse mouse = new Mouse("White", mouseWeight);

        if(mouseWeight < 1){
            Log.i("cat say", "I'm gonna eat you lil mouse! " + mouse.mouseVoice());
        }
        else {
            Log.i("cat say", "Yo big bro you scaring me!");
        }
    }
}
