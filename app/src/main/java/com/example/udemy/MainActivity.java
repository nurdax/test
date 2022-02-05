package com.example.udemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {




    //переменная или ссылка на класс
    Dog myDog;
    Dog Nur;
    Dog kempir;
    wolf Wolf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDog = new Dog();
        myDog.name = "Qotaqbas";
        myDog.age = 18;
        myDog.gav();

        Nur = new Dog();
        Nur.gav();
        Nur.breathe();

        kempir = new Dog();
        kempir.initFie(4,"kempirushka");
        kempir.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(kempir.numberOfLegs));
        kempir.gav();

        Wolf = new wolf();
        Wolf.breathe();

        Wolf.numberOfLegs = 5;
        Wolf.initFie(6,"qasqyr");
        Log.i("numberOfLegs", String.valueOf(Wolf.numberOfLegs));
        Wolf.isAlive = true;
        Wolf.gav();

        Wolf.A = "QOTAQBAS";
        Wolf.eth();

        wolf gang = new  wolf();
        gang.gav();


    }
}