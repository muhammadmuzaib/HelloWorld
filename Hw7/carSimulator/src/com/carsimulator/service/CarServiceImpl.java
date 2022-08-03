package com.carsimulator.service;

import com.carsimulator.Car;

public class CarServiceImpl implements CarService{

    private void acceleration(Car car){
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\tAccelerating\n");
            car.accelerate();
            car.getOdometer().incrementMileage();
            System.out.println("The speed is: " + car.getSpeed() + "\n"
                    + "The current mileage is: " + car.getOdometer().getMileage() + "\n"
                    + "The Fuel Level is : " + car.getFuelGauge().getFuelLevel());
        }
        car.getOdometer().decrementFuelLevel(car.getFuelGauge());
    }

    private void braking(Car car){
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\tBraking\n");
            car.brake();
            car.getOdometer().incrementMileage();
            System.out.println("The speed is: " + car.getSpeed() + "\n"
                    + "The current mileage is: " + car.getOdometer().getMileage() + "\n"
                    + "The Fuel Level is : " + car.getFuelGauge().getFuelLevel());
        }
        car.getOdometer().decrementFuelLevel(car.getFuelGauge());
    }

    @Override
    public void driveCar(Car car) {
        //Accelerate and brake car until fuel runs out.
        while(car.getFuelGauge().getFuelLevel() > 0)
        {
            acceleration(car);

            //check fuel again
            if(car.getFuelGauge().getFuelLevel() <= 0)
            {
                System.out.println("Out of Fuel!!");
                break;
            }
            braking(car);
        }
    }
}
