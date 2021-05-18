package com.globallogic.myshapes;
import java.util.Comparator;

public class AreaComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Shape shapeToCompare1 = (Shape)o1;
        Shape shapeToCompare2 = (Shape)o2;
        return (int) Math.ceil(shapeToCompare1.calcArea() - shapeToCompare2.calcArea());
    }
}
