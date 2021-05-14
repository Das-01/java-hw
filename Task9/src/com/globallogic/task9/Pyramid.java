package com.globallogic.task9;

public class Pyramid {
//        Write class Pyramid with public static method printPyramid(int h) that takes parameter
//        an integer h between 1 and 9 and prints a pyramid of numbers of height h.

    public static void printLine(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.print(i);
        }
        for (int i = h-1; i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void  printSpaces(int spaces){
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    public static void printPiramid(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printLine(i);
            System.out.println();
        }
    }
}
