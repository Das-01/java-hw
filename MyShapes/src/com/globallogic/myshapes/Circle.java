package com.globallogic.myshapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double circleSquare = Math.PI * Math.pow(radius,2);
        return circleSquare;
    }

    @Override
    public String toString() {
        return super.toString() + "; radius: " + radius;
    }

}
