package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat implements Printable{

    public Lion(){
        super();
        Log.i("constructor", "Constructor Lion()");
    }

    public static String whatLionsLike(){
        return "I'm Lion and I like playing, jumping and sometimes scratching";
    }

    @Override
    public void draw() {
        Log.i("draw()", "Draw Lion");

    }

    @Override
    public void print() {
        Log.i("print()", "Print Lion");
    }
}
