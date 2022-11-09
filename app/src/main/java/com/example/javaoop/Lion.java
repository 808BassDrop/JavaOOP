package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat{
    public void talk(){
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name + ", and I'm " + age + " years old." + Lion.whatLionsLike());

    }

    public static String whatLionsLike(){
        return "I'm Lion and I like playing, jumping and sometimes scratching";
    }

}
