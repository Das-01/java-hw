package com.globallogic.myshapes;

abstract class Shape implements Drawable, Comparable {

    private String shapeColor;

    public Shape(String shapeColor) {
        setShapeColor(shapeColor);
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color: "  + shapeColor;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(toString() + "; Area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape shapeToCompare = (Shape)o;
        return (int) Math.ceil(this.calcArea() - shapeToCompare.calcArea());
    }
}
