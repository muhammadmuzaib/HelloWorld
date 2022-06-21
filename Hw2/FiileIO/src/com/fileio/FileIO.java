package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIO
{

    public static void main(String[] args)  throws Exception
    {
        //Initialising read and write files.
        Scanner scanner = new Scanner(new File("readFile.txt"));
        PrintStream ps = new PrintStream("printFile.txt");

        //Declaring variables to store data in.
        // Read: Date , Sku, Price, Discount
        String date;
        int sku;
        double price;
        double discount;

        // out put file
        String startDate = null;
        String endDate = null;
        double totalPrice = 0;
        double tax;
        Integer skuForHighestPrice = null;
        Integer skuForLowestPrice = null;
        double maxPrice = 0;
        Double minPrice = null;

        scanner.useDelimiter(",|\\n");
        while (scanner.hasNext()) {
            date = scanner.next();
            sku = Integer.parseInt(scanner.next());
            price = Double.parseDouble(scanner.next());
            discount = Double.parseDouble(scanner.next());
            double finalPrice = calcFinal(price, discount);

            totalPrice = totalPrice + finalPrice;
            if (startDate == null) {
                startDate = date;
            }
            endDate = date;
            if (maxPrice < finalPrice) {
                maxPrice = finalPrice;
                skuForHighestPrice = sku;
            }
            if (minPrice == null || finalPrice < minPrice) {
                minPrice = finalPrice;
                skuForLowestPrice = sku;
            }
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
        tax = calcTax(totalPrice);

        //Write to file
        ps.println("Report from " + startDate + " to " + endDate);
        ps.println("The total is $" + totalPrice);
        ps.println("The tax is $" + tax);
        ps.println("The highest price item is #" + skuForHighestPrice + " at $" + maxPrice);
        ps.println("The lowest price item is #" + skuForLowestPrice + " at $" + minPrice);

        scanner.close();
        ps.close();
    }//end main

    //Function to calc final price.
    public static double calcFinal(double price, double discount)
    {
        return price - discount;
    }

    //calc tax
    public static double calcTax(double total)
    {
        double nyTax = 8.88/100;
        double tax = nyTax * total;
        return tax;
    }

}
