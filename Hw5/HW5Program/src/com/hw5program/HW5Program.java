/*
Name: HW5Program
Author: Muhammad Muzaib
Description: The program reads input from the file then it proceeds to calculate the distance.
After that the program prints to console a report for all the vehicles using printReport()
and then also prints the same report to file using saveFIle() function.

 */

package com.hw5program;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class HW5Program
{
    public static void main(String[] args) throws Exception
    {
        int speed;
        int time;
        int distance;
        String line, vehicleName;

        Scanner scanner = new Scanner(new File("readFile.txt"));
        PrintStream ps = new PrintStream("outFIle.txt");
        line = scanner.nextLine();

        scanner.useDelimiter(",|\\n");
        while(scanner.hasNext())
        {
            vehicleName = scanner.next();
            speed = Integer.parseInt(scanner.next());
            time = Integer.parseInt(scanner.next().trim());

            distance = calcDistance(speed, time);
            printReport(speed, time, vehicleName);
            saveAsFile(ps,speed,time,vehicleName);
        }
        scanner.close();
        ps.close();
    }//end of main

    //Function take in speed and time of a vehicle and returns the total distance travelled.
    public static int calcDistance(int speed, int time)
    {
        return speed * time;
    }

    //Function prints a report on the current vehicle
    public static void printReport(int speed, int time, String vehicleName)
    {
        int distance = speed;
        System.out.println("\nReport for vehicle: " + vehicleName);
        System.out.println("\tHour\t\tDistance Traveled\n----------------------------------");

        for(int count = 1; count <= time; count++)
        {
            System.out.println("\t" + count + "\t\t" + distance);
            distance = distance + speed;
        }
    }

    //Function takes in output file and writes report to the output file.
   public static void saveAsFile(PrintStream ps, int speed, int time, String vehicleName)
    {
        int distance = speed;
        ps.println("\nReport for vehicle: " + vehicleName);
        ps.println("\tHour\t\tDistance Traveled\n----------------------------------");

        for(int count = 1; count <= time; count++)
        {
            ps.println("\t" + count + "\t\t" + distance);
            distance = distance + speed;
        }
    }
}
