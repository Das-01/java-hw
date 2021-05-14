package com.globallogic.task9;
import java.lang.Math;

public class Calculator {
//      The value of 𝝅 can be calculated with series:
//      𝝅 = +4/1-4/3 + 4/5 - 4/7 + 4/9 - 4/11 + …
//      Write class Calculator with public static method calcPi that takes as parameter an integer n,
//      and computes and returns the value of 𝝅 approximated to the first n term of the series

     public static double calcPi(int n) {
         double pi = 0;
//         for (double i = 0; i <= n; i++) {
//             double one = Math.pow(-1, i);
//             pi += one * (4/(1 + i*2));
//         }

         for (double i = 0; i <= n; i++) {
             if (i % 2 == 0) {
                 pi += (4/(1 + i*2));
             } else {
                 pi -= (4/(1 + i*2));
             }
         }

         System.out.println(Math.PI);
         return pi;
     }
}
