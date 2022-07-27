/*
Name: yearProgram.java
Author: Muhammad Muaib
Description: Program takes month and year as user input and figures displays month days and year onto the
console. Program does this by figuring out whether the year is a leapYear and adjusting the month days
accordingly.
 */

package com.yearprogram;
import java.util.Scanner;

class Month
{
    //Variables
    protected int monthNumber;

    //Constructors
    Month()
    {
        monthNumber = 1;
    }

    public Month(int monthNumber)
    {
        while(monthNumber < 1|| monthNumber > 12)
        {
            try
            {
                throw new IllegalArgumentException("Error: Month Number is > 12 or < 1. Try again.");
            }
            catch (Exception e)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter month number again: ");
                monthNumber = sc.nextInt();
                this.monthNumber = monthNumber;
                sc.close();
            }
        }
        this.monthNumber = monthNumber;
    }

    Month(String monthName) {
        String[] monthList = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST",
                "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        monthName = monthName.toUpperCase();
        while (searchArray(monthList, monthName) == -1)
        {
            try
            {
                throw new IllegalArgumentException("Error: Wrong month name entered. Try again");
            }
            catch (Exception e)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the month name gain: ");
                monthName = sc.next();
                sc.close();
            }
        }
    }

    //Custom Search array method. takes in array to search and confirms if target exists.
    public int searchArray(String[] array, String target)
    {
        target = target.toUpperCase();
        for(int index = 0; index < array.length; index++)
        {
            if(array[index] == target)
            {
                return index;
            }
        }
        return -1;
    }

    //Setters and getters
    public void setMonth(int monthNumber)
    {
        if(monthNumber > 12 || monthNumber < 1)
        {
            this.monthNumber = 1;
        }
        else
        {
            this.monthNumber = monthNumber;
        }
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String getMonthName()
    {
        String name ="Month Name not found";
        String[] monthList = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST",
                "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        int num = this.getMonthNumber();
        num = num -1; //Adjusting month for algorithm
        return monthList[num];
    }

    //Function takes in a number and return sthe corresponding month name.
    public String toString(int number)
    {
        number = number - 1;    //Adjusting month number for algorithm.
        String[] monthList = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST",
                "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String name = monthList[number];
        return name;
    }

    //Function checks if the argument object data is the same as the calling object.
    public Boolean equals(Month obj)
    {
        int num1 = obj.getMonthNumber();
        if(num1 == monthNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class MonthDays extends Month
{
    //variables
    int year;
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //Constructor calls parent class constructor to set month.
    public MonthDays(int month, int year)
    {
        super(month);
        this.year = year;
    }

    //Functions
    public int getYear()
    {
        return year;
    }

    //Function checks if a year is leap year
    public boolean isLeapYear(int year)
    {
        if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                return true;
            }
        }
        else if(year % 100 != 0 && year % 4 == 0)
        {
            return true;
        }
        return false;
    }

    //Function gets the number of days in a month.
    public int getNumberOfDays()
    {
        int days;
        int monthNum = super.monthNumber - 1;
        String[] monthList = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST",
                "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        if(isLeapYear(this.year) && monthNum == 1)
        {
            days = daysInMonth[monthNum];
            days = days +1;
            return days;
        }
        else
        {
            days = daysInMonth[monthNum];
            return days;
        }
    }

    //Function displays Year and month
    protected void display()
    {
        String monthName = getMonthName();
        System.out.println(monthName + " " + this.getYear() + " has " + getNumberOfDays()
                            + " days");
    }
}
public class yearProgram
{
    public static void main(String[] args)
    {
        //Declaring variables and objects.
        int month, year;
        Scanner keyboard = new Scanner(System.in);

        //Getting input for year and month.
        System.out.print("Enter a month (1-12): ");
        month = keyboard.nextInt();
        System.out.print("Enter a year: ");
        year = keyboard.nextInt();

        MonthDays obj = new MonthDays(month, year);
        obj.display();
        keyboard.close();
    }
}
