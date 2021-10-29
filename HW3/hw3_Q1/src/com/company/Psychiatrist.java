package com.company;

public class Psychiatrist {
    Moody moodyObject;

    public void examine(Moody moodyObject){
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(Moody moodyObject){
        moodyObject.ExpressFeelings();
        System.out.println(moodyObject.toString());
    }

    public String toString(){
        return moodyObject.toString();
    }



}
