package com.globallogic.exceptions;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Dariia", "Fediushyna", 26);

        for (int i = 0; i < 2; i++) {
            try {
                person1.setAge(i);
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            } finally {
                System.out.println(person1.getAge());
            }
        }

        for (int i = 119; i < 122; i++) {
            try {
                person1.setAge(i);
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            } finally {
                System.out.println(person1.getAge());
            }
        }

    }
}
