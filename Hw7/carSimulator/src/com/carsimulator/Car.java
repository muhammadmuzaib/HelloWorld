package com.carsimulator;

public class Car {
    private static final int CAR_FUEL_LIMIT = 15;
    private int yearModel;
    private String make;
    private int speed;
    private int carRange = 24 * 15;

    private FuelGauge fuelGauge;

    private Odometer odometer;

    public Car(int yearModel, String make, FuelGauge fuelGauge, Odometer odometer) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
        this.fuelGauge = fuelGauge;
        this.odometer = odometer;
    }

    public int getCarRange() {
        return carRange;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMake() {
        return make;
    }

    public int getYearModel() {
        return yearModel;
    }

    //Accelerate and brake functions
    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        if (this.speed <= 0) {
            System.out.println("The car is stopped.");
        } else {
            this.speed -= 5;
        }
    }

    public void fillTank(){
        //Fill up the car
        System.out.println("Filling cars Fuel Tank.");
        for(int fuelIndex = 1; fuelIndex <= CAR_FUEL_LIMIT; fuelIndex++)
        {
            this.getFuelGauge().incrementFuelLevel();
            System.out.println(this.getFuelGauge().getFuelLevel());
        }
    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;
    }

    public Odometer getOdometer() {
        return odometer;
    }
}