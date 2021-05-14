package com.globallogic.task9;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int min = Math.findMin(arr1);
        int max = Math.findMax(arr1);

        System.out.println("Min: " + min + "; " + "Max: " + max);

        double circleArea = Math.areaOfCircle(3);
        System.out.println("Area of circle is: " + circleArea);

        System.out.println("Number of employees: " + Employee.getNumberOfEmployees());

        Employee employee1 = new Employee("John", "Doy", "12345678");
        Employee employee2 = new Employee("Bob", "Johnson", "12459875");
        Employee employee3 = new Employee("Maria", "Daniels", "8765432");

        System.out.println("Number of employees: " + Employee.getNumberOfEmployees());

        System.out.println(Calculator.calcPi(12345));

        Pyramid.printPiramid(5);

    }
}
