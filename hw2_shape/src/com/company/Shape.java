package com.company;

public class Shape {
    public String name;
    public String color;
    public int area;
    public int perimeter;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;

    }

    public Shape(String name, String color, int perimeter, int area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;

    }

    public Shape() {
    }

    public void printShape(){
       System.out.println("The " + name + " has a " + color + " color.");

   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {

        return area;
    }

    public void setArea(int area) {

        this.area = area;
    }

    public int getPerimeter() {

        return perimeter;
    }

    public void setPerimeter(int perimeter) {

        this.perimeter = perimeter;
    }
}
