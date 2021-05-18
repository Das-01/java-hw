package com.globallogic.myshapes;
import java.util.Comparator;

public class ColorComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Shape shapeColor1 = (Shape)o1;
        Shape shapeColor2 = (Shape)o2;

        return shapeColor1.getShapeColor().compareTo(shapeColor2.getShapeColor());
    }

}
