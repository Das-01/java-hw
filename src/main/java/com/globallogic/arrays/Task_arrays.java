package com.globallogic.arrays;
import java.util.Arrays;
public class Task_arrays {


    /*
    Increase by 2
        The sequence of integers is given. Increase by 2 each its non-negative element.
     */
    public int[] increaseBy2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] += 2;
            }
        }
        return arr;
    }

    /*
    The first is not greater for 2,5
        Array of real numbers is given. Find the first element in array which value does not exceed 2.5.
        In the case of absence the specified element print "Not Found"
    */
    public double findFirstNumber(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 2.5) {
                return arr[i];
            }
        }
        System.out.println("Not found");
        return 0;
    }

    /*
    The arithmetic mean of positive
        The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
        If the array doesn't have positive number return 0.
     */
    public double arithmeticalMean(double[] arr) {
        double result = 0;
        int count = 0;
        int countNegative = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0) {
                result += arr[i];
                count++;
            } else {
                countNegative++;
            }
        }
        if (countNegative == arr.length) {
            return 0;
        }
        result =  result/count;
        return result;
    }

    /*
        The sequence of integers is given. Find max int value in sequence
     */
    public int findMax1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    Maximum of absolute values
        The sequence of real numbers is given. Lets find their absolute values. Find the maximum value among these absolute values.
     */
    public double maxOfAbsoluteValues(double[] arr) {
        double maxAbs = 0;

        for (int i = 0; i < arr.length; i++) {
            if ( Math.abs(arr[i]) > Math.abs(maxAbs)) {
                maxAbs = arr[i];
            }
        }
        return maxAbs;
    }

    /*
    Negative elements
        The sequence of n real numbers is given. Find the sum of negative elements in it.
     */
    public double negativeElementsSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /*
    Reverse array
    Array of int is given. Return the given array in the reverse order
     */
    public int[] reverseArray(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i = (arr.length - 1), j = 0; i >= 0; i--, j++) {
            resultArray[j] = arr[i];
        }
        return resultArray;
    }
}
