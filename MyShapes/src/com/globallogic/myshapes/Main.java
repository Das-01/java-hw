package com.globallogic.myshapes;
import java. util. Arrays;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Red", 3);
        Circle circle2 = new Circle("Green", 5);
        Circle circle3 = new Circle("Pink", 2);
//        System.out.println(circle1);
//        System.out.println(circle1.calcArea());

        Rectangle rec1 = new Rectangle("Red", 11, 22);
        Rectangle rec2 = new Rectangle("Lily", 6, 2);
        Rectangle rec3 = new Rectangle("Wight", 1, 3);
        Rectangle rec4 = new Rectangle("Brown", 15, 12);
        Rectangle rec5 = new Rectangle("Coral", 14, 2);
//        System.out.println(rec1);
//        System.out.println(rec1.calcArea());

        Triangle tr1 = new Triangle("Green", 4,5,6);
        Triangle tr2 = new Triangle("Yellow", 2,2,2);
        Triangle tr3 = new Triangle("Black", 1,2,3);
//        System.out.println(tr1);
//        System.out.println(tr1.calcArea());

        Shape[] differentShapes = {circle1, circle2, rec1, rec2, rec3, rec4, rec5, tr1, tr2};
        double sumTotal = 0;
        double sumOfCircles = 0;
        double sumOfRectangles = 0;
        double sumOfTriangles = 0;

        for (Shape item:differentShapes) {
            System.out.println(item.toString());
            System.out.println("Area is: " + item.calcArea());
            sumTotal += item.calcArea();

            if (item instanceof  Circle) {
                sumOfCircles += item.calcArea();
            } else if (item instanceof  Rectangle) {
                sumOfRectangles += item.calcArea();
            } else if (item instanceof  Triangle) {
                sumOfTriangles += item.calcArea();
            }
        }

        System.out.println("Sum of all shapes is: " + sumTotal);
        System.out.println("Sum of all Circles is: " + sumOfCircles);
        System.out.println("Sum of all Rectangulars is: " + sumOfRectangles);
        System.out.println("Sum of all Triangles is: " + sumOfTriangles);

        System.out.println("==== Task 12.2: New interface 'Draw' ====");
        for (Shape item:differentShapes) {
            item.draw();
        }

        System.out.println("==== Task 12.3: Comparable ====");
        Arrays.sort(differentShapes);
        for (Shape item:differentShapes) {
            System.out.println("This is: " + item.getClass().getSimpleName() + " with area: " + item.calcArea());
        }

        System.out.println("==== Task 12.4.1: Comparator via Area ====");
        Shape[] task4Shapes = {circle1, circle3, rec1, rec2, rec3, rec4, rec5, tr1, tr2, tr3};
        Arrays.sort(task4Shapes, new AreaComparator());
        for (Shape item:task4Shapes) {
            System.out.println("This is: " + item.getClass().getSimpleName() + " with area: " + item.calcArea());
        }

        System.out.println("==== Task 12.4.2: Comparator via color ====");
        Arrays.sort(task4Shapes, new ColorComparator());
        for (Shape item:task4Shapes) {
            System.out.println("This is: " + item.getClass().getSimpleName() + " with color: " + item.getShapeColor());
        }
    }
}
