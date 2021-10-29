package com.company;

public class Happy extends Moody{
    @Override
    public String getMood() {
        return "Happy";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHA!!");
    }

    public String toString(){
        return "Observation: Subject laughs a lot";
    }
}
