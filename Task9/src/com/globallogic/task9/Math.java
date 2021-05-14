package com.globallogic.task9;

public class Math {

    final static double PI = 3.14;

//    Create class Math with two static methods findMin and findMax.
//    Methods will take array of int values as arguments and return minimum and maximum element value.
    public static int findMin(int[] inputArray){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        return min;
    }

    public static int findMax(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return max;
    }

//    Add to class Math (from task 1) final static field PI = 3.14
//    and static method areaOfCircle, which will take radius and calculate area of circle.
    public static double areaOfCircle(double radius) {
        double circleArea = PI * radius * radius;
        return circleArea;
    }

}
