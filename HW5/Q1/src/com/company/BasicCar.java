package com.company;

public class BasicCar implements ICar{
    public BasicCar(){}

    @Override
    public void assemble(){
        System.out.println("Basic car.");
    }
}
