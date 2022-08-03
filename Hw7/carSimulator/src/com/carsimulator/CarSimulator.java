package com.carsimulator;

import com.carsimulator.factory.CarFactory;
import com.carsimulator.service.CarService;
import com.carsimulator.service.CarServiceImpl;

public class CarSimulator
{
    public static void main(String[] args)
    {
        Car car = CarFactory.createCar();
        car.fillTank();

        CarService carService = new CarServiceImpl();
        carService.driveCar(car);
    }//end main
}