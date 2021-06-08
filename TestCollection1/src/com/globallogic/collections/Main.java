package com.globallogic.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("==== TASK 1: ====");
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add("number_" + i);
        }

        Iterator<String> newIterator = newList.iterator();
        while(newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }

        System.out.println("==== TASK 2: ====");
        List<String> task2List = new LinkedList<>();
        Random x = new Random();
        for (int i = 0; i < 10; i++) {
            task2List.add(x.nextInt(task2List.size() + 1), "number_" + i);
        }

        Iterator<String> task2Iterator = task2List.iterator();
        while(task2Iterator.hasNext()) {
            System.out.print(task2Iterator.next() + " ");
        }

        System.out.println("\n" + "==== TASK 3: ====");
        System.out.println(MyNumGenerator.generate(5,64));

    }

}
