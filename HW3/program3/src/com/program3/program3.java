package com.program3;

import java.io.File;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class program3
{
    public static void main(String[] args) throws Exception
    {
        int age;
        String date;
        String line;

        //Initialising read and write files.
        Scanner scanner = new Scanner(new File("readFile.txt"));
        PrintStream ps = new PrintStream("printFile.txt");
        ps.println("\nRecord Entry Date: " + LocalDate.now());
        line = scanner.nextLine();

        while(scanner.hasNext())
        {
            date = scanner.nextLine();
            LocalDate DOB = LocalDate.parse(date);   //date has input format YYYY-MM-DD

            //Print age
            age = calcAge(DOB);
            System.out.println("The age for DOB " + date + " is " + age);

            //Write the age to file
            ps.println("The age for DOB " + date + " is " + age);

        }
        scanner.close();
        ps.close();
    }
    //Function calculates and returns age
    public static int calcAge(LocalDate DOB)
    {
        LocalDate currentDate = LocalDate.now();              //gets current date
        return Period.between(DOB, currentDate).getYears();   //gets the difference between current
                                                              //date and DOB and then converts to years.
    }
}
