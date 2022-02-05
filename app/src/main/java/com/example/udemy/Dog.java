package com.example.udemy;

import android.util.Log;

public class Dog extends Animal{
    //Модификаторы
    //private, protected, public
    public int age;
    public String name;

    public Dog(){
        age = 81;
        name = "don";
    }

    public void gav(){
        Log.i("gav()", "Gav, gav my name is " + name + " and i'm " + age + " years old");
    }

    public void initFie(int Age, String name){
        age = Age;
        this.name = name;
    }

}
