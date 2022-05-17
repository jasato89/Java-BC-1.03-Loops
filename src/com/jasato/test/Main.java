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
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        i = 0;
        System.out.println("\n===Do-While loop===\n");

        do {
            System.out.println(names[i++]);
        } while (i < names.length);

        System.out.println("\n===Stream===\n");
        Arrays.asList(names).stream().forEach(System.out::println);


        /*
        Working in pairs, create a new project where you iterate over
         an array of integers and update each position of this array by
          multiplying that value by the value of the next position.
           The last position must be multiplied by the first position of the array.
            input: [5, 4, 3, 2, 1]
            output: [20, 12, 6, 2, 5] // Explanation 5*4, 4*3, 3*2, 2*1, 1*5
         */

        int[] array = {5, 3, 4, 6, 1};

        System.out.println("\n\nEjercicio 1 - Loops");
        int firstNumber = array[0];

        for (int z = 0; z < array.length; z++) {
            if (z == array.length - 1) {
                array[z] = array[z] * firstNumber;
                System.out.println(array[z]);
            } else {
                array[z] = array[z] * array[z + 1];
                System.out.println(array[z]);
            }
        }


        System.out.println("Ejercicio 2 - Loops");
        /*
        Working in pairs, in the same project create a method to invert an array

        Example
        input: [1, 2, 3, 4, 5]
        output: [5, 4, 3, 2, 1]
         */

        int[] newArray = {5, 3, 4, 6, 1};
        int[] newArrayReversed = new int[newArray.length];

        /*
        int x = 0;
        for (int j = newArray.length -1; j >= 0; j--) {
            newArrayReversed[x] = newArray[j];
            System.out.println(newArrayReversed[x]);
            x++;


        }

         */
        int x = newArray.length -1;
        for (int j = 0; j < newArray.length; j++) {
            newArrayReversed[x] = newArray[j];
            x--;

        }

        for (int number : newArrayReversed) {
            System.out.println(number);
        }




    }

}
