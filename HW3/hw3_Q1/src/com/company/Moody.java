package com.company;

public abstract class Moody {

    abstract String getMood();

    abstract void ExpressFeelings();

    public void queryMood(){
        System.out.println("I feel " + getMood() +" today!!");
    }

}
