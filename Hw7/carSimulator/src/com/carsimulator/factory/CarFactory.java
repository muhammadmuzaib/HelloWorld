package com.carsimulator.factory;

import com.carsimulator.Car;
import com.carsimulator.FuelGauge;
import com.carsimulator.Odometer;

import java.util.Scanner;

public class CarFactory {
    private CarFactory(){}
    public static final Car createCar() {
        try (Scanner keyBoard = new Scanner(System.in)) {
            String carMake;
            String carName;
            int yearModel;

            //Declaring objects and getting input
            System.out.print("Enter make of the car: ");
            carMake = keyBoard.next();
            System.out.print("Enter name of the Car: ");
            carName = keyBoard.next();
            System.out.print("Enter yearModel of the car: ");
            yearModel = keyBoard.nextInt();
            System.out.println("\n\nName of the Car is: " + carName + "\n" +
                                "Car make is " + carMake + "\n" +
                                "Car year is " + yearModel);
            return new Car(yearModel, carMake, new FuelGauge(), new Odometer());
        }
    }
}
