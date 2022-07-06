// Program calculates fibonacci sequence, sum of squares and factorial and then prints to screen and file.
package com.program1;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) throws Exception
    {
        int input;

        //Initialising read and write files.
        Scanner scanner = new Scanner(new File("readFile.txt"));
        PrintStream ps = new PrintStream("printFile.txt");

        while(scanner.hasNext())
        {
            input = scanner.nextInt();
            displayFactorial(input, ps);
            input = scanner.nextInt();
            displaySumOfSquares(input, ps);
            input = scanner.nextInt();
            fibonacciSequence(input, ps);
        }
        scanner.close();
        ps.close();
    }//end main

    //Function calculates and prints the factorial of a number to screen and file.
    public static void displayFactorial(int num, PrintStream ps) {
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer = answer * i;
        }
        System.out.println("The factorial of " + num + " is: " + answer);
        ps.println("The factorial of " + num + " is: " + answer);
    }

    //Function calculates and prints the sum of squares to screen and file.
    public static void displaySumOfSquares(int num, PrintStream ps)
    {
        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += (i * i);
        }
        System.out.println("The sum of squares for "+ num + " is: " + sum);
        ps.println("The sum of squares for "+ num + " is: " + sum);
    }

    //Function displays and prints the Fibonacci sequence to screen and file.
    public static void fibonacciSequence(int inputNum, PrintStream ps)
    {
        //Variables to store the two numbers being added and a counter.
        int num1 = 0, num2 = 1, counter, sum;
        System.out.print("\nThe fibonacci sequence for" + inputNum + " is: " + num1 + " " + num2);
        ps.print("\nThe fibonacci sequence for " + inputNum + " is: "+ num1 + " " + num2);
        for(counter = 2; counter < inputNum; counter++)
        {
            //Swapping numbers for the next value in line and also getting the sum.
            sum = num2 + num1;
            System.out.print( " " + sum);
            ps.print( " " + sum);
            num1 = num2;
            num2 = sum;
        }
    }
}

