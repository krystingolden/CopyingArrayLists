package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*
https://programmingbydoing.com/
Copying arraylists - Assignment #181
*/
    public static void main(String[] args) {
        //Create 2 array lists to hold integers
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();

        //Initialize a counter and a randomizer
        int index;
        Random r = new Random();

        //Fill the first array list with random numbers between 1 and 100
        for (index = 0; index < 10; index++){
            int number = r.nextInt(100);
            integers1.add(number);
        }

        //Copy the values of the first array list into the second array list
        for (index = 0; index < integers1.size(); index++){
            integers2.add(integers1.get(index));
        }

        //Change the value of the integer in the last spot of the first array list
        integers1.set((integers1.size()-1), -7);

        //Print out the values in the first array list
        System.out.print("ArrayList 1: ");
        for (index = 0; index < integers1.size(); index++){
            System.out.print(integers1.get(index) + "  ");
        }

        System.out.println();

        //Print out the values in the second array list
        System.out.print("ArrayList 2: ");
        for (index = 0; index < integers1.size(); index++){
            System.out.print(integers2.get(index) + "  ");
        }
    }
}
