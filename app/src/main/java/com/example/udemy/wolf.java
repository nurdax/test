package com.example.udemy;

import android.util.Log;

public class wolf extends Dog{
    String A;

    public void gav(){
        Log.i("gav()", "Auu, auu my name is " + name + " and i'm " + age + " years old");
    }
    public void eth(){
        Log.i("eth()","I like ethereum");
    }
    public void eth(String a){
        this.A = a;
        Log.i("eth()","I like ethereum" + A);
    }

}
