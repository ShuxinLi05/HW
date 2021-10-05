package com.company;

public class Square extends Shape{

    public int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.side = side;


    }

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        super.getArea();
        int area = 0;
        int side = getSide();
        area = side * side;

        return area;
    }

    public int getPerimeter() {
        super.getPerimeter();

        int perimeter = 0;
        int side = getSide();

        perimeter = 4 * side;

        return perimeter;
    }

}
