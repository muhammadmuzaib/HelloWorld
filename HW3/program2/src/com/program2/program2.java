package com.program2;

import java.util.Scanner;

public class program2
{
    public static void main(String[] args)
    {
        int choice;
        double side1, side2;
        final double PI = 3.14;
        Scanner keyBoard = new Scanner(System.in);
        displayMenu();
        choice = keyBoard.nextInt();

        switch(choice)
        {
            case 1:
                System.out.print("Please enter the length of the square: ");
                side1 = keyBoard.nextDouble();
                displaySquare(side1);
                break;
            case 2:
                System.out.print("Please enter the length of the rectangle: ");
                side1 = keyBoard.nextDouble();
                System.out.print("Please enter the width of the rectangle: ");
                side2 = keyBoard.nextDouble();
                displayRectangle(side1, side2);
                break;
            case 3:
                System.out.print("Please enter the radius of the circle: ");
                side1 = keyBoard.nextDouble();
                displayCircle(PI, side1);
                break;
            default:
                System.out.println("Error: Please enter a valid choice.\n Terminating Program");
                break;
        }
    }//end main
    public static void displayMenu()
    {
        System.out.println("----------Your Choices---------- ");
        System.out.println("1. Square\n2. Rectangle\n3. Circle\n");
        System.out.print("Please choose from the above menu and enter choice: ");
    }

    //Function takes input and calculates area and perimeter of the square.
    public static void displaySquare(double length)
    {
        double area = length * length;
        double perimeter = 4 * length;
        System.out.println("The area of the square with length " + length + " is " + area + " and the " +
                            "perimeter is " + perimeter);
    }

    //Function takes input and calculates area and perimeter of a rectangle.
    public static void displayRectangle(double length, double width)
    {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of rectangle with the length " + length + " and width " +
                            width + " is " + area + " and the perimeter is " + perimeter);
    }

    //Function takes input and calculates area and circumference of circle.
    public static void displayCircle(final double PI, double radius)
    {
        double area = PI * (radius * radius);
        double circumference = 2 * (PI * radius);
        System.out.println("The area of the circle with radius " + radius +
                            " is " + area + " and the circumference is " + circumference);
    }
}
