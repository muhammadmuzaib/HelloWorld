package com.circlestat;

import java.util.Scanner;

public class CircleStat
{
    public static void main(String[] args)
    {
        //Declare variables and Scanner
        float radius, area, circumference;
        float pi = (float) 3.14;
        Scanner sc = new Scanner(System.in);

        //Ask user for input.
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextFloat();
        //Calc the area and circumference of the circle.
        area = pi *(radius * radius);
        circumference = 2 *(pi * radius);

        //Print area and circumference
        System.out.println("When the radius is " + radius + " the circumference is "
                            + circumference + " and the area is " + area);
    }
}
