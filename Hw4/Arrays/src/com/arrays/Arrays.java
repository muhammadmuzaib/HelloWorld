package com.arrays;

import java.time.LocalTime;
import java.util.Random;

public class Arrays
{
    public static void main(String[] args)
    {
        int numberOfRows, numberOfColumns;

        //Declaring and initializing the string array
        String[] stringArray = {"First", "Second", "Third", "Fourth" ,"Fifth",
                "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};

        //Declaring and initializing the time array
        LocalTime[] timeArray = new LocalTime[3];
        timeArray[0] = LocalTime.now();
        timeArray[1] = LocalTime.of(2,30,58);
        timeArray[2] = LocalTime.of(5,20,40);

        //Initializing the 2d array
        int [][] values = new int[10][20];

        //calling the functions
        System.out.println("\nPrinting the basicArray function: ");
        basicArray();
        System.out.println("\nPrinting the StringArray: ");
        printElements(stringArray);
        System.out.println("Printing the TimeArray: ");
        printElements(timeArray);

        //Gets and prints rows and columns of the 2d array.
        numberOfRows = values.length;
        numberOfColumns = values[0].length;
        System.out.println("\nNumber of rows in the 2d array are " + numberOfRows +
                " and the number of columns are " + numberOfColumns);

        //intialize and print array
        values = initializeArray(values);
        printElements(values);

    }//end main

    //Function declares and initializes an array. It is then displayed onto the screen.
    public static void basicArray()
    {
        int size = 50;
        int[] nums = new int[size];

        //intialize array
        for(int index = 0; index < size; index++)
        {
            nums[index] = 10;
        }

        //Print array
        for(int counter = 0; counter < size; counter++)
        {
            System.out.println("The value at index " + counter + " is: " + nums[counter]);
        }
    }

    //Function takes in a string array and prints to screen.
    public static void printElements(String[] array)
    {
        //declaring string object;
        String storedValue;

        //Storing what is in array into the string object and print.
        for(int index = 0; index < array.length; index++)
        {
            storedValue = array[index];
            System.out.println("\nThe value of the string array at index " + index + " is: " + storedValue);
        }
        System.out.println("\n");
    }

    //Function accepts a 2d array and prints it.
    public static void printElements(int[][] array)
    {
        //printing the 2d array.
        for(int row = 0; row < array.length; row++)
        {
            // prints columns
            for(int col = 0; col < array.length; col++)
            {
                System.out.printf("%d ", array[row][col]);
            }
            System.out.print("\n");
        }
    }

    //Function takes a 2d array input, initializes it with random numbers and returns the array.
    public static int[][] initializeArray(int[][] array)
    {
        Random rd = new Random();
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array.length; col++)
            {
                array[row][col] = rd.nextInt(9) + 1;
            }
        }
        return array;
    }

    //Function prints the Time object array
    public static void printElements(LocalTime[] array)
    {
        String arrayValue;
        //Print the array
        for(int index = 0; index < array.length; index++)
        {
            arrayValue = String.valueOf(array[index]);
            System.out.println("The value of the Time array at index " + index + " is: " + arrayValue);
        }
    }
}
