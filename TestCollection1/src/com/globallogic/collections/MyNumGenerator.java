package com.globallogic.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }


    public static List<Integer> generate(int numOfElm, int maxNumb) {
        Random randomValue = new Random();
        List<Integer> generatedList = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            generatedList.add(randomValue.nextInt(maxNumb));
        }
        return  generatedList;
    }
}
