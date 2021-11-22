package com.company;

public class CarDecorator implements ICar{
    protected ICar basicCar = null;
    protected String name = "";

    public CarDecorator(ICar car){
        this.basicCar = car;
    }

    @Override
    public void assemble(){
        basicCar.assemble();
        System.out.println(" Adding features of " + this.name + ".");
    }
}
