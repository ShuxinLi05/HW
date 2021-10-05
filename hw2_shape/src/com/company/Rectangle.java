package com.company;

public class Rectangle extends Shape{

    public int width;
    public int height;
    public int side;

    public Rectangle(String name, String color, int width, int height) {

        super(name, color);
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;

    }
    public Rectangle(int side){
        this.side = side;

    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        int width = getWidth();
        int height = getHeight();

        if(height != 0){
            area = width * height;
        } else {
            area = side * side;
        }

        return area;
    }

    public int getPerimeter() {
        super.getPerimeter();
        int perimeter = 0;
        int side = getSide();
        int width = getWidth();
        int height = getHeight();
        if(height != 0){
            perimeter = 2 * (width + height);
        }else{
            perimeter = 4 * side;
        }
        return perimeter;
    }

}
