package com.globallogic.myshapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        double triangleSquare = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return triangleSquare;
    }

    @Override
    public String toString() {
        return super.toString() + "; side a:" + a + "; side b:" + b + "; side c:" + c;
    }

}
