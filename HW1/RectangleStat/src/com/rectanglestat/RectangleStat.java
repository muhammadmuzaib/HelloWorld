package com.rectanglestat;

import java.util.Scanner;

public class RectangleStat
{
    public static void main(String[] args)
    {
        float width, length, area, perimeter;
        //Asking user for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle(cm): ");
        width = sc.nextFloat();
        System.out.println("Please enter the length of the rectangle(cm): ");
        length = sc.nextFloat();

        //Calc Area and perimeter
        area = width * length;
        perimeter = 2 * (length + width);
        //Display Area and perimeter.
        System.out.println("When one side is " + width + " and the other side is " + length +
                            ", the area of the rectangle is " + area + "cm^2 and the perimeter is "
                            + perimeter);
    }
}
