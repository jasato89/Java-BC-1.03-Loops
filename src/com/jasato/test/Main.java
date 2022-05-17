package com.jasato.test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Pepe", "Maria", "Antonio", "Teresa"};

        System.out.println("===For Loop===\n");

        for (short i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("\n===For Loop Reversed===\n");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }
        System.out.println("\n===For Each===\n");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n===While loop===\n");

        int i = 0;
        while(i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        i =0;
        System.out.println("\n===Do-While loop===\n");

        do{
            System.out.println(names[i++]);
        }while(i < names.length);

        System.out.println("\n===Stream===\n");
        Arrays.asList(names).stream().forEach(System.out::println);

        Car.getYear("Ford");

        Car myCar = new Car("Ford", "Focus");
        myCar.getYear("Ford");

    }

}
