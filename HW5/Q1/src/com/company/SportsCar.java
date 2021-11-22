package com.company;

public class SportsCar extends CarDecorator{
    public SportsCar(ICar car) {
        super(car);
        this.name = "Sport Car";
    }

}
